package com.scapponawslambda.scfapp.awslambdahandler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;

public class AWSLambdaHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, String> {
}