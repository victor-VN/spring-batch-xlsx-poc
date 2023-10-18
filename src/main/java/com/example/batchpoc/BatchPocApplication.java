package com.example.batchpoc;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchPocApplication implements CommandLineRunner {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchPocApplication.class, args)));
	}

	@Override
	public void run(String... args) throws Exception
	{
		JobParameters params = new JobParametersBuilder()
				.addString("date", "2010-06-27")
				.toJobParameters();
		jobLauncher.run(job, params);
	}

}
