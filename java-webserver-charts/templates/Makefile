.PHONY: apply get port-forward test

apply:
	kubectl apply -f templates/deployment.yaml
	kubectl apply -f templates/service.yaml
	kubectl apply -f templates/istio-gateway.yaml
	kubectl apply -f templates/istio-virtualservice.yaml

get:
	kubectl get pods
	kubectl get services

port-forward:
	kubectl port-forward service/java-webserver-service 8080:8080

test:
	for i in {1..100}; do curl -s http://localhost:8080/hotels; sleep 0.1; done
