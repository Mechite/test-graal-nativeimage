#!/usr/bin/env bash

native-image \
 --no-fallback \
 --module com.example.consumer/com.example.consumer.ServiceConsumer \
 --module-path \
 "service-provider/target/service-provider-1.0-SNAPSHOT.jar":"service-consumer/target/service-consumer-1.0-SNAPSHOT.jar"