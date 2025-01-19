FROM ubuntu:latest
LABEL authors="sanch"

WORKDIR /app

RUN apt-get update && apt-get install -y \
    curl \
    openjdk-17-jdk \
    unzip \
    && rm -rf /var/lib/apt/lists/*

