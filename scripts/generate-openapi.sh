#!/usr/bin/env bash

# Main procedure.
set -e

on_exit () {
    echo "generate.sh has exited in error"
}

trap on_exit ERR

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )/.." && pwd )"
cd "$DIR"


JAVA_VER=$(javap -verbose java.lang.String | grep "major version" | cut -d " " -f5)

if [[ $JAVA_VER -lt 55 ]]
   then
       echo "In order to use the Java openapi-generator-cli, you need Java 11 runtime at minimum (class file version 55.0). Alternatives are available here: https://openapi-generator.tech/"
       exit
fi

mkdir -p .codegen
rm -rf .codegen

java -jar scripts/resources/jars/openapi-generator-cli-7.9.0.jar generate -g java -i scripts/resources/swagger/apis.swagger3.yaml -o .codegen \
    --skip-validate-spec  \
    --invoker-package com.taurushq.sdk.protect.openapi \
    --api-package com.taurushq.sdk.protect.openapi.api \
    --model-package com.taurushq.sdk.protect.openapi.model

cp -R .codegen/src/main/java openapi/src/main
rm -rf .codegen

# patch ApiClient to add TPV1 required functionnality
patch openapi/src/main/java/com/taurushq/sdk/protect/openapi/ApiClient.java < scripts/tpv1.patch