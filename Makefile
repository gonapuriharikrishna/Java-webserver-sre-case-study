# Makefile
build:
    gradle bootJar
    docker build -t your-image-name:tag .

helm-install:
    helm install your-app ./charts/your-app

helm-uninstall:
    helm uninstall your-app

apply-istio:
    kubectl apply -f k8s/istio/

test:
    # Add testing commands here

clean:
    helm uninstall your-app || true
    kubectl delete -f k8s/ || true
