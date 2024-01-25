****Deployment of Java Microservice on Kubernetes with Istio and Helm****

Welcome to the documentation for deploying a Java microservice application that provides hotel search results. This guide outlines the steps to deploy the application on Kubernetes using Istio Service Mesh and Helm Charts.

Prerequisites
Before you begin, make sure you have the following software installed:

1. Gradle 8.5
2. Java 17
3. Docker 24.0.7
4. Kubernetes 1.28.2
5. K3d for local Kubernetes setup

****Setup Instructions****
**Gradle Installation**
Download and install Gradle from the official website: Gradle Downloads. Ensure Gradle is added to your system's PATH.

**Docker Installation**
Install Docker from the official Docker website: Docker Install.

**Kubernetes and K3d Installation**
Install K3d using Chocolatey (Windows package manager):
>> choco install k3d
Install Helm using Chocolatey:
>> choco install kubernetes-helm

**Setting up the Environment**
After installing the required software, set up your development environment:

Unzip the file. 
Navigate to the project directory

**Deploying the Microservice**
Follow these steps to deploy the microservice on Kubernetes:

1. Build the Microservice:

 Use Gradle to build the microservice:
 >> gradle bootJar

2. Dockerize the Application:
   Build a Docker image of your microservice:
   
