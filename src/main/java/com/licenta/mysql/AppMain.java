package com.licenta.mysql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import weka.core.pmml.jaxbbindings.Application;

public class AppMain extends Application {

	public static void main(String[] args) {

		try {

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
			EntityManager em = emf.createEntityManager();

			List<Mytable> data = em.createNamedQuery("Mytable.getAllData", Mytable.class).getResultList();

			System.out.println(data.size());
			BufferedWriter writer = new BufferedWriter(new FileWriter("resources/data.txt"));
			BufferedWriter writerExpected = new BufferedWriter(new FileWriter("resources/expected.txt"));
			for (int i = 0; i < data.size(); i++) {
				
				String expected = data.get(i).getId() + ";";
				
				String dataLine = data.get(i).getId() + "," + data.get(i).geteNBcellConfig0dlBandwidth() + "," +
						            data.get(i).getMac_stats_total_bytes_sdus_ul() + "," +
						            data.get(i).getMac_stats_total_bytes_sdus_dl() + "," +
						            data.get(i).geteNBcellConfig0siConfigsfn() + "," +
						            data.get(i).geteNBcellConfig0ulPuschPower() + "," +
						            data.get(i).geteNBcellConfig0ulFreq() + "," +
						            data.get(i).getLClcUeConfig0rnti() + "," +
						            data.get(i).geteNBcellConfig0dlFreq() + ",";
				if(data.get(i).getY().equals("yes")) {
					dataLine+="1";
					expected+="1";
				}
				else {
					dataLine+="0";
					expected+="0";
				}
				dataLine+= "\n";
				expected+="\n";
				
				System.out.println(dataLine);
			    writer.write(dataLine);  
			    writerExpected.write(expected);
			}
			writer.close();
			 writerExpected.close();
			System.out.println("FINISH");
		} catch (Exception e) {
			System.out.println("ERROR");
			System.out.println(e);
		}
	}

}
