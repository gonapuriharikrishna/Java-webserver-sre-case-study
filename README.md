Overview
This project demonstrates the deployment of a Java microservices application on Kubernetes using Helm and Istio for service mesh capabilities. The project includes the following components:

Java Application: A simple web server application built with Spring Boot.
Docker: Dockerized the Java application for easy deployment.
Kubernetes: Deployed the application on Kubernetes for container orchestration.
Helm: Used Helm charts for packaging and deploying Kubernetes applications.
Istio: Integrated Istio for advanced service mesh features.
Prerequisites
Ensure the following tools are installed on your local machine:

Java Development Kit (JDK) 11
Docker
Gradle 6 (optional)
Helm
k3d (for local Kubernetes cluster)
Istio (installed on the Kubernetes cluster)
Build the Java Application
Navigate to the java-webserver directory:

 
cd your-app/java-webserver
Run Gradle to build the JAR file:

 
gradle bootJar
Or, if using the provided gradlew:

 
./gradlew bootJar
The JAR file is generated in the build/libs/ directory.

Build Docker Image
Navigate back to the project root:

 
cd your-app
Build the Docker image:

 
docker build -t your-image-name:tag .
Deploy on Kubernetes with Helm
Install k3d (if not installed):

 
brew install k3d  # or use an alternative method for your OS
Create a local Kubernetes cluster using k3d:

 
k3d cluster create your-cluster-name
Install Istio on the Kubernetes cluster:

Follow the official Istio installation guide.

Deploy the application using Helm:

 
helm install your-app ./charts/your-app
Apply Istio configurations (Gateway and VirtualService):

 
kubectl apply -f k8s/istio/
Monitor the deployment:

 
kubectl get pods -w
Test the Deployment
After the pods are ready, run tests:

 
make test  # or use your preferred testing method
Cleanup
Uninstall the Helm chart:

 
make helm-uninstall  # or use `helm uninstall your-app`
Delete the local Kubernetes cluster:

 
k3d cluster delete your-cluster-name
Additional Notes
Modify configurations and values in Helm charts as needed.
Customize Istio configurations based on specific requirements.
Refer to Helm and Istio documentation for advanced configurations and options.
Feel free to reach out for any further clarification or assistance.

