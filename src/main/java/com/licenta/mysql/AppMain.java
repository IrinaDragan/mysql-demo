package com.licenta.mysql;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.beanutils.BeanUtils;

import weka.core.pmml.jaxbbindings.Application;

public class AppMain extends Application {

	public static String [] goodFeatures = {"id","mac_stats_total_bytes_sdus_ul","mac_stats_total_bytes_sdus_dl", "eNBcellConfig0ulPuschPower", "eNBcellConfig0dlBandwidth", "eNBcellConfig0ulBandwidth",
			"eNBcellConfig0dlPdschPower", "eNBcellConfig0enable64QAM", "eNBcellConfig0siConfigsfn"};
			
	public static int loc_in_vector(String[] v, int n, String searched) {
		int i;
		for(i=0;i<n;i++) {
			if(v[i].equals(searched)) {
				break;
			}
		}
		return i;
	}
	
	
	public static void write_all_data(List<Mytable> data) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("resources/all_data.txt"));
		for (int i = 0; i < data.size(); i++) {	
			String dataLine = data.get(i).getId() + "," + 
							data.get(i).getBs_id() + "," +
							data.get(i).getAgent_info0agent_id() + "," +
							data.get(i).getAgent_info0bs_id() + "," +
							data.get(i).getAgent_info0capabilities0() + "," +
							data.get(i).getAgent_info0capabilities1() + "," +
							data.get(i).getAgent_info0capabilities2() + "," +
							data.get(i).getAgent_info0capabilities3() + "," +
							data.get(i).getAgent_info0capabilities4() + "," +
							data.get(i).getAgent_info0capabilities5() + "," +
							data.get(i).getAgent_info0capabilities6() + "," +
							data.get(i).getAgent_info0capabilities7() + "," +
							data.get(i).geteNBheaderversion() + "," +
							data.get(i).geteNBheadertype() + "," +
							data.get(i).geteNBheaderxid() + "," +
							data.get(i).geteNBeNBId() + "," +
							data.get(i).geteNBcellConfig0phyCellId() + "," +
							data.get(i).geteNBcellConfig0cellId() + "," +
							data.get(i).geteNBcellConfig0puschHoppingOffset() + "," +
							data.get(i).geteNBcellConfig0hoppingMode() + "," +
							data.get(i).geteNBcellConfig0nSb() + "," +
							data.get(i).geteNBcellConfig0phichResource() + "," +
							data.get(i).geteNBcellConfig0phichDuration() + "," +
							data.get(i).geteNBcellConfig0initNrPDCCHOFDMSym() + "," +
							data.get(i).geteNBcellConfig0siConfigsfn() + "," +
							data.get(i).geteNBcellConfig0siConfigsib1Length() + "," +
							data.get(i).geteNBcellConfig0siConfigsiWindowLength() + "," +
							data.get(i).geteNBcellConfig0dlBandwidth() + "," +
							data.get(i).geteNBcellConfig0ulBandwidth() + "," +
							data.get(i).geteNBcellConfig0ulCyclicPrefixLength() + "," +
							data.get(i).geteNBcellConfig0dlCyclicPrefixLength() + "," +
							data.get(i).geteNBcellConfig0antennaPortsCount() + "," +
							data.get(i).geteNBcellConfig0duplexMode() + "," +
							data.get(i).geteNBcellConfig0subframeAssignment() + "," +
							data.get(i).geteNBcellConfig0specialSubframePatterns() + "," +
							data.get(i).geteNBcellConfig0prachConfigIndex() + "," +
							data.get(i).geteNBcellConfig0prachFreqOffset() + "," +
							data.get(i).geteNBcellConfig0raResponseWindowSize() + "," +
							data.get(i).geteNBcellConfig0macContentionResolutionTimer() + "," +
							data.get(i).geteNBcellConfig0maxHARQMsg3Tx() + "," +
							data.get(i).geteNBcellConfig0n1PUCCHAN() + "," +
							data.get(i).geteNBcellConfig0deltaPUCCHShift() + "," +
							data.get(i).geteNBcellConfig0nRBCqi() + "," +
							data.get(i).geteNBcellConfig0srsSubframeConfig() + "," +
							data.get(i).geteNBcellConfig0srsBwConfig() + "," +
							data.get(i).geteNBcellConfig0srsMacUpPts() + "," +
							data.get(i).geteNBcellConfig0enable64QAM() + "," +
							data.get(i).geteNBcellConfig0carrierIndex() + "," +
							data.get(i).geteNBcellConfig0dlFreq() + "," +
							data.get(i).geteNBcellConfig0ulFreq() + "," +
							data.get(i).geteNBcellConfig0eutraBand() + "," +
							data.get(i).geteNBcellConfig0dlPdschPower() + "," +
							data.get(i).geteNBcellConfig0ulPuschPower() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0id() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0label() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0percentage() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0isolation() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0priority() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0positionLow() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0positionHigh() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0maxmcs() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting0() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting1() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting2() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting3() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting4() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0sorting5() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0accounting() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0schedulerName() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0id() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0label() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0percentage() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0isolation() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0priority() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0firstRb() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0maxmcs() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0accounting() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0schedulerName() + "," +
							data.get(i).geteNBcellConfig0sliceConfigintrasliceShareActive() + "," +
							data.get(i).geteNBcellConfig0sliceConfigintersliceShareActive() + "," +
							data.get(i).getUEueConfig0rnti() + "," +
							data.get(i).getUEueConfig0timeAlignmentTimer() + "," +
							data.get(i).getUEueConfig0transmissionMode() + "," +
							data.get(i).getUEueConfig0ueAggregatedMaxBitrateUL() + "," +
							data.get(i).getUEueConfig0ueAggregatedMaxBitrateDL() + "," +
							data.get(i).getUEueConfig0capabilitieshalfDuplex() + "," +
							data.get(i).getUEueConfig0capabilitiesintraSFHopping() + "," +
							data.get(i).getUEueConfig0capabilitiestype2Sb1() + "," +
							data.get(i).getUEueConfig0capabilitiesueCategory() + "," +
							data.get(i).getUEueConfig0capabilitiesresAllocType1() + "," +
							data.get(i).getUEueConfig0ueTransmissionAntenna() + "," +
							data.get(i).getUEueConfig0ttiBundling() + "," +
							data.get(i).getUEueConfig0maxHARQTx() + "," +
							data.get(i).getUEueConfig0betaOffsetACKIndex() + "," +
							data.get(i).getUEueConfig0betaOffsetRIIndex() + "," +
							data.get(i).getUEueConfig0betaOffsetCQIIndex() + "," +
							data.get(i).getUEueConfig0ackNackSimultaneousTrans() + "," +
							data.get(i).getUEueConfig0simultaneousAckNackCqi() + "," +
							data.get(i).getUEueConfig0aperiodicCqiRepMode() + "," +
							data.get(i).getUEueConfig0ackNackRepetitionFactor() + "," +
							data.get(i).getUEueConfig0pcellCarrierIndex() + "," +
							data.get(i).getUEueConfig0imsi() + "," +
							data.get(i).getUEueConfig0dlSliceId() + "," +
							data.get(i).getUEueConfig0ulSliceId() + "," +
							data.get(i).getLCheaderversion() + "," +
							data.get(i).getLCheadertype() + "," +
							data.get(i).getLCheaderxid() + "," +
							data.get(i).getLClcUeConfig0rnti() + "," +
							data.get(i).getLClcUeConfig0lcConfig0lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig0lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig0direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig0qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig0qci() + "," +
							data.get(i).getLClcUeConfig0lcConfig1lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig1lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig1direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig1qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig1qci() + "," +
							data.get(i).getLClcUeConfig0lcConfig2lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig2lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig2direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig2qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig2qci() + "," +
							data.get(i).getMac_stats_total_bytes_sdus_ul() + "," +
							data.get(i).getMac_stats_total_bytes_sdus_dl() + ",";
			
			if(data.get(i).getY().equals("yes")) {
				dataLine+="1";
			}
			else {
				dataLine+="0";
			}
			dataLine+= "\n";
			
		    writer.write(dataLine);
		}
		writer.close();
	}
	
	public static void write_all_data_no_strings(List<Mytable> data) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("resources/all_data_no_strings.txt"));
		int index_agent_info0capabilities0 = 0;
		int index_agent_info0capabilities1 = 0;
		int index_agent_info0capabilities2 = 0;
		int index_agent_info0capabilities3 = 0;
		int index_agent_info0capabilities4 = 0;
		int index_agent_info0capabilities5 = 0;
		int index_agent_info0capabilities6 = 0;
		int index_agent_info0capabilities7 = 0;
		int index_eNBcellConfig0sliceConfigdl0label = 0;
		int index_eNBcellConfig0sliceConfigdl0isolation = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting0 = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting1 = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting2 = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting3 = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting4 = 0;
		int index_eNBcellConfig0sliceConfigdl0sorting5 = 0;
		int index_eNBcellConfig0sliceConfigdl0accounting = 0;
		int index_eNBcellConfig0sliceConfigdl0schedulerName = 0;
		int index_eNBcellConfig0sliceConfigul0label = 0;
		int index_eNBcellConfig0sliceConfigul0isolation = 0;
		int index_eNBcellConfig0sliceConfigul0accounting = 0;
		int index_eNBcellConfig0sliceConfigul0schedulerName = 0;
		int index_eNBcellConfig0sliceConfigintrasliceShareActive = 0;
		int index_eNBcellConfig0sliceConfigintersliceShareActive = 0;
		String[] unique_agent_info0capabilities0 = new String[100];
		String[] unique_agent_info0capabilities1 = new String[100];
		String[] unique_agent_info0capabilities2 = new String[100];
		String[] unique_agent_info0capabilities3 = new String[100];
		String[] unique_agent_info0capabilities4 = new String[100];
		String[] unique_agent_info0capabilities5 = new String[100];
		String[] unique_agent_info0capabilities6 = new String[100];
		String[] unique_agent_info0capabilities7 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0label = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0isolation = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting0 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting1 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting2 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting3 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting4 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0sorting5 = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0accounting = new String[100];
		String[] unique_eNBcellConfig0sliceConfigdl0schedulerName = new String[100];
		String[] unique_eNBcellConfig0sliceConfigul0label = new String[100];
		String[] unique_eNBcellConfig0sliceConfigul0isolation = new String[100];
		String[] unique_eNBcellConfig0sliceConfigul0accounting = new String[100];
		String[] unique_eNBcellConfig0sliceConfigul0schedulerName = new String[100];
		String[] unique_eNBcellConfig0sliceConfigintrasliceShareActive = new String[100];
		String[] unique_eNBcellConfig0sliceConfigintersliceShareActive = new String[100];
		int loc=0;
		for (int i = 0; i < data.size(); i++) {	
			String dataLine = data.get(i).getId() + "," + 
							data.get(i).getBs_id() + "," +
							data.get(i).getAgent_info0agent_id() + "," +
							data.get(i).getAgent_info0bs_id() + ",";
			
			loc = loc_in_vector(unique_agent_info0capabilities0,index_agent_info0capabilities0,data.get(i).getAgent_info0capabilities0());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities0) {
				unique_agent_info0capabilities0[index_agent_info0capabilities0]=data.get(i).getAgent_info0capabilities0();
				index_agent_info0capabilities0++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities1,index_agent_info0capabilities1,data.get(i).getAgent_info0capabilities1());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities1) {
				unique_agent_info0capabilities1[index_agent_info0capabilities1]=data.get(i).getAgent_info0capabilities1();
				index_agent_info0capabilities1++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities2,index_agent_info0capabilities2,data.get(i).getAgent_info0capabilities2());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities2) {
				unique_agent_info0capabilities2[index_agent_info0capabilities2]=data.get(i).getAgent_info0capabilities2();
				index_agent_info0capabilities2++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities3,index_agent_info0capabilities3,data.get(i).getAgent_info0capabilities3());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities3) {
				unique_agent_info0capabilities3[index_agent_info0capabilities3]=data.get(i).getAgent_info0capabilities3();
				index_agent_info0capabilities3++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities4,index_agent_info0capabilities4,data.get(i).getAgent_info0capabilities4());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities4) {
				unique_agent_info0capabilities4[index_agent_info0capabilities4]=data.get(i).getAgent_info0capabilities4();
				index_agent_info0capabilities4++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities5,index_agent_info0capabilities5,data.get(i).getAgent_info0capabilities5());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities5) {
				unique_agent_info0capabilities5[index_agent_info0capabilities5]=data.get(i).getAgent_info0capabilities5();
				index_agent_info0capabilities5++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities6,index_agent_info0capabilities6,data.get(i).getAgent_info0capabilities6());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities6) {
				unique_agent_info0capabilities6[index_agent_info0capabilities6]=data.get(i).getAgent_info0capabilities6();
				index_agent_info0capabilities6++;
			}
			
			loc = loc_in_vector(unique_agent_info0capabilities7,index_agent_info0capabilities7,data.get(i).getAgent_info0capabilities7());
			dataLine+=loc + ",";
			if(loc==index_agent_info0capabilities7) {
				unique_agent_info0capabilities7[index_agent_info0capabilities7]=data.get(i).getAgent_info0capabilities7();
				index_agent_info0capabilities7++;
			}
							
			dataLine+=data.get(i).geteNBheaderversion() + "," +
							data.get(i).geteNBheadertype() + "," +
							data.get(i).geteNBheaderxid() + "," +
							data.get(i).geteNBeNBId() + "," +
							data.get(i).geteNBcellConfig0phyCellId() + "," +
							data.get(i).geteNBcellConfig0cellId() + "," +
							data.get(i).geteNBcellConfig0puschHoppingOffset() + "," +
							data.get(i).geteNBcellConfig0hoppingMode() + "," +
							data.get(i).geteNBcellConfig0nSb() + "," +
							data.get(i).geteNBcellConfig0phichResource() + "," +
							data.get(i).geteNBcellConfig0phichDuration() + "," +
							data.get(i).geteNBcellConfig0initNrPDCCHOFDMSym() + "," +
							data.get(i).geteNBcellConfig0siConfigsfn() + "," +
							data.get(i).geteNBcellConfig0siConfigsib1Length() + "," +
							data.get(i).geteNBcellConfig0siConfigsiWindowLength() + "," +
							data.get(i).geteNBcellConfig0dlBandwidth() + "," +
							data.get(i).geteNBcellConfig0ulBandwidth() + "," +
							data.get(i).geteNBcellConfig0ulCyclicPrefixLength() + "," +
							data.get(i).geteNBcellConfig0dlCyclicPrefixLength() + "," +
							data.get(i).geteNBcellConfig0antennaPortsCount() + "," +
							data.get(i).geteNBcellConfig0duplexMode() + "," +
							data.get(i).geteNBcellConfig0subframeAssignment() + "," +
							data.get(i).geteNBcellConfig0specialSubframePatterns() + "," +
							data.get(i).geteNBcellConfig0prachConfigIndex() + "," +
							data.get(i).geteNBcellConfig0prachFreqOffset() + "," +
							data.get(i).geteNBcellConfig0raResponseWindowSize() + "," +
							data.get(i).geteNBcellConfig0macContentionResolutionTimer() + "," +
							data.get(i).geteNBcellConfig0maxHARQMsg3Tx() + "," +
							data.get(i).geteNBcellConfig0n1PUCCHAN() + "," +
							data.get(i).geteNBcellConfig0deltaPUCCHShift() + "," +
							data.get(i).geteNBcellConfig0nRBCqi() + "," +
							data.get(i).geteNBcellConfig0srsSubframeConfig() + "," +
							data.get(i).geteNBcellConfig0srsBwConfig() + "," +
							data.get(i).geteNBcellConfig0srsMacUpPts() + "," +
							data.get(i).geteNBcellConfig0enable64QAM() + "," +
							data.get(i).geteNBcellConfig0carrierIndex() + "," +
							data.get(i).geteNBcellConfig0dlFreq() + "," +
							data.get(i).geteNBcellConfig0ulFreq() + "," +
							data.get(i).geteNBcellConfig0eutraBand() + "," +
							(data.get(i).geteNBcellConfig0dlPdschPower()+27) + "," +
							(data.get(i).geteNBcellConfig0ulPuschPower()+96) + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0id() + ",";
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0label,index_eNBcellConfig0sliceConfigdl0label,data.get(i).geteNBcellConfig0sliceConfigdl0label());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0label) {
				unique_eNBcellConfig0sliceConfigdl0label[index_eNBcellConfig0sliceConfigdl0label]=data.get(i).geteNBcellConfig0sliceConfigdl0label();
				index_eNBcellConfig0sliceConfigdl0label++;
			}
				dataLine+=data.get(i).geteNBcellConfig0sliceConfigdl0percentage() + ",";
				
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0isolation,index_eNBcellConfig0sliceConfigdl0isolation,data.get(i).geteNBcellConfig0sliceConfigdl0isolation());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0isolation) {
				unique_eNBcellConfig0sliceConfigdl0isolation[index_eNBcellConfig0sliceConfigdl0isolation]=data.get(i).geteNBcellConfig0sliceConfigdl0isolation();
				index_eNBcellConfig0sliceConfigdl0isolation++;
			}
						
			dataLine+=data.get(i).geteNBcellConfig0sliceConfigdl0priority() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0positionLow() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0positionHigh() + "," +
							data.get(i).geteNBcellConfig0sliceConfigdl0maxmcs() + ",";
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting0,index_eNBcellConfig0sliceConfigdl0sorting0,data.get(i).geteNBcellConfig0sliceConfigdl0sorting0());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting0) {
				unique_eNBcellConfig0sliceConfigdl0sorting0[index_eNBcellConfig0sliceConfigdl0sorting0]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting0();
				index_eNBcellConfig0sliceConfigdl0sorting0++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting1,index_eNBcellConfig0sliceConfigdl0sorting1,data.get(i).geteNBcellConfig0sliceConfigdl0sorting1());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting1) {
				unique_eNBcellConfig0sliceConfigdl0sorting1[index_eNBcellConfig0sliceConfigdl0sorting1]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting1();
				index_eNBcellConfig0sliceConfigdl0sorting1++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting2,index_eNBcellConfig0sliceConfigdl0sorting2,data.get(i).geteNBcellConfig0sliceConfigdl0sorting2());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting2) {
				unique_eNBcellConfig0sliceConfigdl0sorting2[index_eNBcellConfig0sliceConfigdl0sorting2]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting2();
				index_eNBcellConfig0sliceConfigdl0sorting2++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting3,index_eNBcellConfig0sliceConfigdl0sorting3,data.get(i).geteNBcellConfig0sliceConfigdl0sorting3());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting3) {
				unique_eNBcellConfig0sliceConfigdl0sorting3[index_eNBcellConfig0sliceConfigdl0sorting3]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting3();
				index_eNBcellConfig0sliceConfigdl0sorting3++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting4,index_eNBcellConfig0sliceConfigdl0sorting4,data.get(i).geteNBcellConfig0sliceConfigdl0sorting4());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting4) {
				unique_eNBcellConfig0sliceConfigdl0sorting4[index_eNBcellConfig0sliceConfigdl0sorting4]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting4();
				index_eNBcellConfig0sliceConfigdl0sorting4++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0sorting5,index_eNBcellConfig0sliceConfigdl0sorting5,data.get(i).geteNBcellConfig0sliceConfigdl0sorting5());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0sorting5) {
				unique_eNBcellConfig0sliceConfigdl0sorting5[index_eNBcellConfig0sliceConfigdl0sorting5]=data.get(i).geteNBcellConfig0sliceConfigdl0sorting5();
				index_eNBcellConfig0sliceConfigdl0sorting5++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0accounting,index_eNBcellConfig0sliceConfigdl0accounting,data.get(i).geteNBcellConfig0sliceConfigdl0accounting());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0accounting) {
				unique_eNBcellConfig0sliceConfigdl0accounting[index_eNBcellConfig0sliceConfigdl0accounting]=data.get(i).geteNBcellConfig0sliceConfigdl0accounting();
				index_eNBcellConfig0sliceConfigdl0accounting++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigdl0schedulerName,index_eNBcellConfig0sliceConfigdl0schedulerName,data.get(i).geteNBcellConfig0sliceConfigdl0schedulerName());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigdl0schedulerName) {
				unique_eNBcellConfig0sliceConfigdl0schedulerName[index_eNBcellConfig0sliceConfigdl0schedulerName]=data.get(i).geteNBcellConfig0sliceConfigdl0schedulerName();
				index_eNBcellConfig0sliceConfigdl0schedulerName++;
			}
			
			dataLine+=data.get(i).geteNBcellConfig0sliceConfigul0id() + ",";
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigul0label,index_eNBcellConfig0sliceConfigul0label,data.get(i).geteNBcellConfig0sliceConfigul0label());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigul0label) {
				unique_eNBcellConfig0sliceConfigul0label[index_eNBcellConfig0sliceConfigul0label]=data.get(i).geteNBcellConfig0sliceConfigul0label();
				index_eNBcellConfig0sliceConfigul0label++;
			}
			
			dataLine+=data.get(i).geteNBcellConfig0sliceConfigul0percentage() + "," ;
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigul0isolation,index_eNBcellConfig0sliceConfigul0isolation,data.get(i).geteNBcellConfig0sliceConfigul0isolation());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigul0isolation) {
				unique_eNBcellConfig0sliceConfigul0isolation[index_eNBcellConfig0sliceConfigul0isolation]=data.get(i).geteNBcellConfig0sliceConfigul0isolation();
				index_eNBcellConfig0sliceConfigul0isolation++;
			}
			
			dataLine+=data.get(i).geteNBcellConfig0sliceConfigul0priority() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0firstRb() + "," +
							data.get(i).geteNBcellConfig0sliceConfigul0maxmcs() + ",";
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigul0accounting,index_eNBcellConfig0sliceConfigul0accounting,data.get(i).geteNBcellConfig0sliceConfigul0accounting());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigul0accounting) {
				unique_eNBcellConfig0sliceConfigul0accounting[index_eNBcellConfig0sliceConfigul0accounting]=data.get(i).geteNBcellConfig0sliceConfigul0accounting();
				index_eNBcellConfig0sliceConfigul0accounting++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigul0schedulerName,index_eNBcellConfig0sliceConfigul0schedulerName,data.get(i).geteNBcellConfig0sliceConfigul0schedulerName());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigul0schedulerName) {
				unique_eNBcellConfig0sliceConfigul0schedulerName[index_eNBcellConfig0sliceConfigul0schedulerName]=data.get(i).geteNBcellConfig0sliceConfigul0schedulerName();
				index_eNBcellConfig0sliceConfigul0schedulerName++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigintrasliceShareActive,index_eNBcellConfig0sliceConfigintrasliceShareActive,data.get(i).geteNBcellConfig0sliceConfigintrasliceShareActive());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigintrasliceShareActive) {
				unique_eNBcellConfig0sliceConfigintrasliceShareActive[index_eNBcellConfig0sliceConfigintrasliceShareActive]=data.get(i).geteNBcellConfig0sliceConfigintrasliceShareActive();
				index_eNBcellConfig0sliceConfigintrasliceShareActive++;
			}
			
			loc = loc_in_vector(unique_eNBcellConfig0sliceConfigintersliceShareActive,index_eNBcellConfig0sliceConfigintersliceShareActive,data.get(i).geteNBcellConfig0sliceConfigintersliceShareActive());
			dataLine+=loc + ",";
			if(loc==index_eNBcellConfig0sliceConfigintersliceShareActive) {
				unique_eNBcellConfig0sliceConfigintersliceShareActive[index_eNBcellConfig0sliceConfigintersliceShareActive]=data.get(i).geteNBcellConfig0sliceConfigintersliceShareActive();
				index_eNBcellConfig0sliceConfigintersliceShareActive++;
			}
			
			dataLine+=		
							data.get(i).getUEueConfig0rnti() + "," +
							data.get(i).getUEueConfig0timeAlignmentTimer() + "," +
							data.get(i).getUEueConfig0transmissionMode() + "," +
							data.get(i).getUEueConfig0ueAggregatedMaxBitrateUL() + "," +
							data.get(i).getUEueConfig0ueAggregatedMaxBitrateDL() + "," +
							data.get(i).getUEueConfig0capabilitieshalfDuplex() + "," +
							data.get(i).getUEueConfig0capabilitiesintraSFHopping() + "," +
							data.get(i).getUEueConfig0capabilitiestype2Sb1() + "," +
							data.get(i).getUEueConfig0capabilitiesueCategory() + "," +
							data.get(i).getUEueConfig0capabilitiesresAllocType1() + "," +
							data.get(i).getUEueConfig0ueTransmissionAntenna() + "," +
							data.get(i).getUEueConfig0ttiBundling() + "," +
							data.get(i).getUEueConfig0maxHARQTx() + "," +
							data.get(i).getUEueConfig0betaOffsetACKIndex() + "," +
							data.get(i).getUEueConfig0betaOffsetRIIndex() + "," +
							data.get(i).getUEueConfig0betaOffsetCQIIndex() + "," +
							data.get(i).getUEueConfig0ackNackSimultaneousTrans() + "," +
							data.get(i).getUEueConfig0simultaneousAckNackCqi() + "," +
							data.get(i).getUEueConfig0aperiodicCqiRepMode() + "," +
							data.get(i).getUEueConfig0ackNackRepetitionFactor() + "," +
							data.get(i).getUEueConfig0pcellCarrierIndex() + "," +
							data.get(i).getUEueConfig0imsi() + "," +
							data.get(i).getUEueConfig0dlSliceId() + "," +
							data.get(i).getUEueConfig0ulSliceId() + "," +
							data.get(i).getLCheaderversion() + "," +
							data.get(i).getLCheadertype() + "," +
							data.get(i).getLCheaderxid() + "," +
							data.get(i).getLClcUeConfig0rnti() + "," +
							data.get(i).getLClcUeConfig0lcConfig0lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig0lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig0direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig0qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig0qci() + "," +
							data.get(i).getLClcUeConfig0lcConfig1lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig1lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig1direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig1qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig1qci() + "," +
							data.get(i).getLClcUeConfig0lcConfig2lcid() + "," +
							data.get(i).getLClcUeConfig0lcConfig2lcg() + "," +
							data.get(i).getLClcUeConfig0lcConfig2direction() + "," +
							data.get(i).getLClcUeConfig0lcConfig2qosBearerType() + "," +
							data.get(i).getLClcUeConfig0lcConfig2qci() + "," +
							data.get(i).getMac_stats_total_bytes_sdus_ul() + "," +
							data.get(i).getMac_stats_total_bytes_sdus_dl() + ",";
			
			if(data.get(i).getY().equals("yes")) {
				dataLine+="1";
			}
			else {
				dataLine+="0";
			}
			dataLine+= "\n";
			
		    writer.write(dataLine);
		}
		writer.close();
	}
	
	public static void write_expected(List<Mytable> data) throws IOException {
		BufferedWriter writerExpected = new BufferedWriter(new FileWriter("resources/expected.txt"));
		for (int i = 0; i < data.size(); i++) {
			String expected = data.get(i).getId() + ";";
			if(data.get(i).getY().equals("yes")) {
				expected+="1";
			}
			else {
				expected+="0";
			}
			expected+="\n";
		
		    writerExpected.write(expected);

		}
		writerExpected.close();
	}
	
	public static void write_data(List<Mytable> data) throws IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("resources/data.txt"));
		for (int i = 0; i < data.size(); i++) {	
			String dataLine="";
			for(int j=0;j<goodFeatures.length;j++) {
				dataLine+=BeanUtils.getProperty(data.get(i),goodFeatures[j])+",";
			}
			if(data.get(i).getY().equals("yes")) {
				dataLine+="1";
			}
			else {
				dataLine+="0";
			}
			dataLine+= "\n";
		    writer.write(dataLine);
		}
		writer.close();
	}
	
	public static void write_train_test_data(List<Mytable> data) throws IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		BufferedWriter writerTrain = new BufferedWriter(new FileWriter("resources/train.txt"));
		BufferedWriter writerTest = new BufferedWriter(new FileWriter("resources/test.txt"));
		
		for (int i = 0; i < data.size(); i++) {
			String dataLine="";
			for(int j=0;j<goodFeatures.length;j++) {
				dataLine+=BeanUtils.getProperty(data.get(i),goodFeatures[j])+",";
			}
			if(data.get(i).getY().equals("yes")) {
				dataLine+="1";
			}
			else {
				dataLine+="0";
			}
			dataLine+= "\n";
		    
		    double random = Math.random();
		    if(random<0.3) {	//pune in test -> 30% date de test
		    	writerTest.write(dataLine);
		    }else {				//60% date de train
		    	writerTrain.write(dataLine);
		    }
		    
		}
		
		writerTest.close();
		writerTrain.close();
	}
	
	public static void write_data_for_cpp_dt(List<Mytable> data) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, IOException {
		String charactersForEncode = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[][] matriceValori = new String[200][200];
		char[][] matriceCodata = new char[200][200];
		
		Field[] fields=Mytable.class.getDeclaredFields();
		int nrLin=data.size();
		int nrCol=fields.length;
		
		int col=0;
		for (Field field : fields) {
			matriceValori[0][col]=field.getName();
            col++;
        }
		for(int i=0;i<data.size();i++) {
			col=0;
			for (Field field : fields) {
				matriceValori[i+1][col]=BeanUtils.getProperty(data.get(i),field.getName());
	            col++;
	        }
		}
		for(int j=0;j<nrCol;j++) {
			int indexValoriUnice=0;
			String[] valoriUnice = new String[200];
				
			for(int i=1;i<=nrLin;i++) {
				if(matriceValori[0][j].equals("mac_stats_total_bytes_sdus_ul")) {	//caz special si facem pe intervale
					int value = Integer.parseInt(matriceValori[i][j]);
					if(value<676510) {
						matriceCodata[i][j]=charactersForEncode.charAt(0);
					}
					if(value>=676510 && value <=1013564) {
						matriceCodata[i][j]=charactersForEncode.charAt(1);
					}
					if(value>1013564 && value <=1421581) {
						matriceCodata[i][j]=charactersForEncode.charAt(2);
					}
					if(value>1421581 && value <=2061991) {
						matriceCodata[i][j]=charactersForEncode.charAt(3);
					}
					if(value>2061991 && value <=368851552) {
						matriceCodata[i][j]=charactersForEncode.charAt(4);
					}
					if(value>368851552 && value <=769558814) {
						matriceCodata[i][j]=charactersForEncode.charAt(5);
					}
					if(value>769558814) {
						matriceCodata[i][j]=charactersForEncode.charAt(6);
					}
				}else if(matriceValori[0][j].equals("mac_stats_total_bytes_sdus_dl")) {	//caz special si facem pe intervale (intervalele folosite si la decision tree)
					int value = Integer.parseInt(matriceValori[i][j]);
					if(value<811077) {
						matriceCodata[i][j]=charactersForEncode.charAt(0);
					}
					if(value>=811077 && value <=1366987) {
						matriceCodata[i][j]=charactersForEncode.charAt(1);
					}
					if(value>1366987 && value <=153149709) {
						matriceCodata[i][j]=charactersForEncode.charAt(2);
					}
					if(value>153149709 && value <=438259102) {
						matriceCodata[i][j]=charactersForEncode.charAt(3);
					}
					if(value>438259102 && value <=574243368) {
						matriceCodata[i][j]=charactersForEncode.charAt(4);
					}
					if(value>574243368) {
						matriceCodata[i][j]=charactersForEncode.charAt(5);
					}
				}else if(matriceValori[0][j].equals("y")) {
					if(matriceValori[i][j].equals("yes")) {
						matriceCodata[i][j]='y';
					}else {
						matriceCodata[i][j]='n';
					}
				}
				else {	//restul au multe valori comune si putem coda
					int k;
					for(k=0;k<indexValoriUnice;k++) {
						if(matriceValori[i][j].equals(valoriUnice[k])) {	//mai exista undeva si l-am encodat
							matriceCodata[i][j]=charactersForEncode.charAt(k);
							break;
						}
					}
					if(k==indexValoriUnice) {	//nu l-am gasit si facem encodare noua
						matriceCodata[i][j]=charactersForEncode.charAt(indexValoriUnice);
						valoriUnice[indexValoriUnice]=matriceValori[i][j];
						indexValoriUnice++;
					}
				}
			}
		}
		
		BufferedWriter writerDT = new BufferedWriter(new FileWriter("resources/data_for_dt_cpp.txt"));
		
		for(int i=1;i<=nrLin;i++) {
			String dataLine="";
			for(int j=0;j<nrCol;j++) {
				int idx;
				for(idx=0;idx<goodFeatures.length;idx++) {
					if(matriceValori[0][j].equals(goodFeatures[idx])) {
						break;
					}
				}
				if(idx==goodFeatures.length) {
					continue;
				}
				dataLine+=matriceCodata[i][j]+",";
			}
			dataLine = dataLine.substring(0, dataLine.length() - 1);
			dataLine = matriceCodata[i][nrCol-1]+","+ dataLine+"\n";	//punem si "y" inainte de toate feature-urile
			//System.out.print(dataLine);
			writerDT.write(dataLine);
		}
		writerDT.close();
	}
	
	public static void main(String[] args) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
			EntityManager em = emf.createEntityManager();
			List<Mytable> data = em.createNamedQuery("Mytable.getAllData", Mytable.class).getResultList();
			
			write_all_data(data);
			write_data(data);
			write_expected(data);
			write_train_test_data(data);
			write_all_data_no_strings(data);
			write_data_for_cpp_dt(data);
			
		} catch (Exception e) {
			//System.out.println("ERROR");
			System.out.println(e);
		}
	}

}
