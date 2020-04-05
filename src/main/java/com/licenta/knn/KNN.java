package com.licenta.knn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import weka.classifiers.Classifier;
import weka.classifiers.lazy.IBk;
import weka.core.Instance;
import weka.core.Instances;
 
public class KNN {
	public static BufferedReader readDataFile(String filename) {
		BufferedReader inputReader = null;
 
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found: " + filename);
		}
		return inputReader;
	}
 
	public static void main(String[] args) throws Exception {
		
    	//execution time measurement
    	Instant start = Instant.now();
    	
    	//memory usage
    	long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    	System.out.println("Before execution: " + beforeUsedMem);
		
		BufferedReader datafile = readDataFile("resources/dataKNN.txt");
 
		Instances data = new Instances(datafile);
		data.setClassIndex(data.numAttributes() - 1);
		
		List<Instance> instancesForTest = new ArrayList<Instance>();
		int nr_max=data.size();
		int countInstancesForTest=0;
		for(int i = 0;  i < nr_max; i+=4) {
			instancesForTest.add(data.instance(i));
			countInstancesForTest++;
		}
		int countDeleted=0;
		for(int i = 0;  i < nr_max; i+=4) {
			data.delete(i-countDeleted);
			countDeleted++;
		}
		
		Classifier ibk = new IBk();		
		ibk.buildClassifier(data);
		int count = 0;
		
		for(int i = 0;  i < countInstancesForTest; i++) {
			int predicted = (int)ibk.classifyInstance(instancesForTest.get(i));
			int expected = Integer.parseInt(instancesForTest.get(i).toString(data.numAttributes() - 1, 0));
			if(predicted == expected ) {
				count ++;
			}
			System.out.println("Predicted: "+ predicted+" Expected:"+expected);
		}
		System.out.println("Precision: "  + (float)count/countInstancesForTest*100);
		
        //execution time measurement
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Elapsed time in miliseconds: "+timeElapsed);
        
    	long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    	System.out.println("After execution: " + afterUsedMem);
    	double x = afterUsedMem-beforeUsedMem;
        
    	System.out.println("Memory used: " + x/1024/1024+"Mb");
		
	}
}