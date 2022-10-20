package com.amigoscode.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials  awsCredentials = new BasicAWSCredentials(
                "AKIATF6AOMTBRUBA4CZV",
                "JqBQyKg4XRPm3vppKxIXYVW17fEpphEa72X91wIy"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withRegion("ap-northeast-1")
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
