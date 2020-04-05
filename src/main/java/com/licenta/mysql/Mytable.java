package com.licenta.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Mytable.getAllData",query="select t from Mytable t")
public class Mytable {
	@Id
	private long id;
	private long bs_id;
	private long agent_info0agent_id;
	private long agent_info0bs_id;
	private String agent_info0capabilities0;
	private String agent_info0capabilities1;
	private String agent_info0capabilities2;
	private String agent_info0capabilities3;
	private String agent_info0capabilities4;
	private String agent_info0capabilities5;
	private String agent_info0capabilities6;
	private String agent_info0capabilities7;
	private int eNBheaderversion;
	private long eNBheadertype;
	private int eNBheaderxid;
	private long eNBeNBId;
	private int eNBcellConfig0phyCellId;
	private int eNBcellConfig0cellId;
	private int eNBcellConfig0puschHoppingOffset;
	private int eNBcellConfig0hoppingMode;
	private long eNBcellConfig0nSb;
	private int eNBcellConfig0phichResource;
	private int eNBcellConfig0phichDuration;
	private int eNBcellConfig0initNrPDCCHOFDMSym;
	private long eNBcellConfig0siConfigsfn;
	private long eNBcellConfig0siConfigsib1Length;
	private long eNBcellConfig0siConfigsiWindowLength;
	private long eNBcellConfig0dlBandwidth;
	private long eNBcellConfig0ulBandwidth;
	private long eNBcellConfig0ulCyclicPrefixLength;
	private long eNBcellConfig0dlCyclicPrefixLength;
	private long eNBcellConfig0antennaPortsCount;
	private int eNBcellConfig0duplexMode;
	private int eNBcellConfig0subframeAssignment;
	private int eNBcellConfig0specialSubframePatterns;
	private int eNBcellConfig0prachConfigIndex;
	private long eNBcellConfig0prachFreqOffset;
	private long eNBcellConfig0raResponseWindowSize;
	private long eNBcellConfig0macContentionResolutionTimer;
	private int eNBcellConfig0maxHARQMsg3Tx;
	private int eNBcellConfig0n1PUCCHAN;
	private int eNBcellConfig0deltaPUCCHShift;
	private int eNBcellConfig0nRBCqi;
	private int eNBcellConfig0srsSubframeConfig;
	private int eNBcellConfig0srsBwConfig;
	private int eNBcellConfig0srsMacUpPts;
	private long eNBcellConfig0enable64QAM;
	private int eNBcellConfig0carrierIndex;
	private long eNBcellConfig0dlFreq;
	private long eNBcellConfig0ulFreq;
	private long eNBcellConfig0eutraBand;
	private long eNBcellConfig0dlPdschPower;
	private long eNBcellConfig0ulPuschPower;
	private long eNBcellConfig0sliceConfigdl0id;
	private String eNBcellConfig0sliceConfigdl0label;
	private long eNBcellConfig0sliceConfigdl0percentage;
	private String eNBcellConfig0sliceConfigdl0isolation;
	private long eNBcellConfig0sliceConfigdl0priority;
	private int eNBcellConfig0sliceConfigdl0positionLow;
	private long eNBcellConfig0sliceConfigdl0positionHigh;
	private long eNBcellConfig0sliceConfigdl0maxmcs;
	private String eNBcellConfig0sliceConfigdl0sorting0;
	private String eNBcellConfig0sliceConfigdl0sorting1;
	private String eNBcellConfig0sliceConfigdl0sorting2;
	private String eNBcellConfig0sliceConfigdl0sorting3;
	private String eNBcellConfig0sliceConfigdl0sorting4;
	private String eNBcellConfig0sliceConfigdl0sorting5;
	private String eNBcellConfig0sliceConfigdl0accounting;
	private String eNBcellConfig0sliceConfigdl0schedulerName;
	private int eNBcellConfig0sliceConfigul0id;
	private String eNBcellConfig0sliceConfigul0label;
	private long eNBcellConfig0sliceConfigul0percentage;
	private String eNBcellConfig0sliceConfigul0isolation;
	private int eNBcellConfig0sliceConfigul0priority;
	private int eNBcellConfig0sliceConfigul0firstRb;
	private long eNBcellConfig0sliceConfigul0maxmcs;
	private String eNBcellConfig0sliceConfigul0accounting;
	private String eNBcellConfig0sliceConfigul0schedulerName;
	private String eNBcellConfig0sliceConfigintrasliceShareActive;
	private String eNBcellConfig0sliceConfigintersliceShareActive;
	private long UEueConfig0rnti;
	private long UEueConfig0timeAlignmentTimer;
	private int UEueConfig0transmissionMode;
	private int UEueConfig0ueAggregatedMaxBitrateUL;
	private int UEueConfig0ueAggregatedMaxBitrateDL;
	private int UEueConfig0capabilitieshalfDuplex;
	private int UEueConfig0capabilitiesintraSFHopping;
	private int UEueConfig0capabilitiestype2Sb1;
	private long UEueConfig0capabilitiesueCategory;
	private int UEueConfig0capabilitiesresAllocType1;
	private long UEueConfig0ueTransmissionAntenna;
	private int UEueConfig0ttiBundling;
	private long UEueConfig0maxHARQTx;
	private int UEueConfig0betaOffsetACKIndex;
	private int UEueConfig0betaOffsetRIIndex;
	private long UEueConfig0betaOffsetCQIIndex;
	private int UEueConfig0ackNackSimultaneousTrans;
	private int UEueConfig0simultaneousAckNackCqi;
	private long UEueConfig0aperiodicCqiRepMode;
	private int UEueConfig0ackNackRepetitionFactor;
	private int UEueConfig0pcellCarrierIndex;
	private long UEueConfig0imsi;
	private int UEueConfig0dlSliceId;
	private int UEueConfig0ulSliceId;
	private int LCheaderversion;
	private long LCheadertype;
	private int LCheaderxid;
	private long LClcUeConfig0rnti;
	private int LClcUeConfig0lcConfig0lcid;
	private int LClcUeConfig0lcConfig0lcg;
	private long LClcUeConfig0lcConfig0direction;
	private int LClcUeConfig0lcConfig0qosBearerType;
	private int LClcUeConfig0lcConfig0qci;
	private long LClcUeConfig0lcConfig1lcid;
	private int LClcUeConfig0lcConfig1lcg;
	private long LClcUeConfig0lcConfig1direction;
	private int LClcUeConfig0lcConfig1qosBearerType;
	private int LClcUeConfig0lcConfig1qci;
	private long LClcUeConfig0lcConfig2lcid;
	private int LClcUeConfig0lcConfig2lcg;
	private int LClcUeConfig0lcConfig2direction;
	private int LClcUeConfig0lcConfig2qosBearerType;
	private int LClcUeConfig0lcConfig2qci;
	private long mac_stats_total_bytes_sdus_ul;
	private long mac_stats_total_bytes_sdus_dl;
	private String y;
	
	
	public long getId() {
		return id;
	}
	public long getBs_id() {
		return bs_id;
	}
	public void setBs_id(long bs_id) {
		this.bs_id = bs_id;
	}
	public long getAgent_info0agent_id() {
		return agent_info0agent_id;
	}
	public void setAgent_info0agent_id(long agent_info0agent_id) {
		this.agent_info0agent_id = agent_info0agent_id;
	}
	public long getAgent_info0bs_id() {
		return agent_info0bs_id;
	}
	public void setAgent_info0bs_id(long agent_info0bs_id) {
		this.agent_info0bs_id = agent_info0bs_id;
	}
	public String getAgent_info0capabilities0() {
		return agent_info0capabilities0;
	}
	public void setAgent_info0capabilities0(String agent_info0capabilities0) {
		this.agent_info0capabilities0 = agent_info0capabilities0;
	}
	public String getAgent_info0capabilities1() {
		return agent_info0capabilities1;
	}
	public void setAgent_info0capabilities1(String agent_info0capabilities1) {
		this.agent_info0capabilities1 = agent_info0capabilities1;
	}
	public String getAgent_info0capabilities2() {
		return agent_info0capabilities2;
	}
	public void setAgent_info0capabilities2(String agent_info0capabilities2) {
		this.agent_info0capabilities2 = agent_info0capabilities2;
	}
	public String getAgent_info0capabilities3() {
		return agent_info0capabilities3;
	}
	public void setAgent_info0capabilities3(String agent_info0capabilities3) {
		this.agent_info0capabilities3 = agent_info0capabilities3;
	}
	public String getAgent_info0capabilities4() {
		return agent_info0capabilities4;
	}
	public void setAgent_info0capabilities4(String agent_info0capabilities4) {
		this.agent_info0capabilities4 = agent_info0capabilities4;
	}
	public String getAgent_info0capabilities5() {
		return agent_info0capabilities5;
	}
	public void setAgent_info0capabilities5(String agent_info0capabilities5) {
		this.agent_info0capabilities5 = agent_info0capabilities5;
	}
	public String getAgent_info0capabilities6() {
		return agent_info0capabilities6;
	}
	public void setAgent_info0capabilities6(String agent_info0capabilities6) {
		this.agent_info0capabilities6 = agent_info0capabilities6;
	}
	public String getAgent_info0capabilities7() {
		return agent_info0capabilities7;
	}
	public void setAgent_info0capabilities7(String agent_info0capabilities7) {
		this.agent_info0capabilities7 = agent_info0capabilities7;
	}
	public int geteNBheaderversion() {
		return eNBheaderversion;
	}
	public void seteNBheaderversion(int eNBheaderversion) {
		this.eNBheaderversion = eNBheaderversion;
	}
	public long geteNBheadertype() {
		return eNBheadertype;
	}
	public void seteNBheadertype(long eNBheadertype) {
		this.eNBheadertype = eNBheadertype;
	}
	public int geteNBheaderxid() {
		return eNBheaderxid;
	}
	public void seteNBheaderxid(int eNBheaderxid) {
		this.eNBheaderxid = eNBheaderxid;
	}
	public long geteNBeNBId() {
		return eNBeNBId;
	}
	public void seteNBeNBId(long eNBeNBId) {
		this.eNBeNBId = eNBeNBId;
	}
	public int geteNBcellConfig0phyCellId() {
		return eNBcellConfig0phyCellId;
	}
	public void seteNBcellConfig0phyCellId(int eNBcellConfig0phyCellId) {
		this.eNBcellConfig0phyCellId = eNBcellConfig0phyCellId;
	}
	public int geteNBcellConfig0cellId() {
		return eNBcellConfig0cellId;
	}
	public void seteNBcellConfig0cellId(int eNBcellConfig0cellId) {
		this.eNBcellConfig0cellId = eNBcellConfig0cellId;
	}
	public int geteNBcellConfig0puschHoppingOffset() {
		return eNBcellConfig0puschHoppingOffset;
	}
	public void seteNBcellConfig0puschHoppingOffset(int eNBcellConfig0puschHoppingOffset) {
		this.eNBcellConfig0puschHoppingOffset = eNBcellConfig0puschHoppingOffset;
	}
	public int geteNBcellConfig0hoppingMode() {
		return eNBcellConfig0hoppingMode;
	}
	public void seteNBcellConfig0hoppingMode(int eNBcellConfig0hoppingMode) {
		this.eNBcellConfig0hoppingMode = eNBcellConfig0hoppingMode;
	}
	public long geteNBcellConfig0nSb() {
		return eNBcellConfig0nSb;
	}
	public void seteNBcellConfig0nSb(long eNBcellConfig0nSb) {
		this.eNBcellConfig0nSb = eNBcellConfig0nSb;
	}
	public int geteNBcellConfig0phichResource() {
		return eNBcellConfig0phichResource;
	}
	public void seteNBcellConfig0phichResource(int eNBcellConfig0phichResource) {
		this.eNBcellConfig0phichResource = eNBcellConfig0phichResource;
	}
	public int geteNBcellConfig0phichDuration() {
		return eNBcellConfig0phichDuration;
	}
	public void seteNBcellConfig0phichDuration(int eNBcellConfig0phichDuration) {
		this.eNBcellConfig0phichDuration = eNBcellConfig0phichDuration;
	}
	public int geteNBcellConfig0initNrPDCCHOFDMSym() {
		return eNBcellConfig0initNrPDCCHOFDMSym;
	}
	public void seteNBcellConfig0initNrPDCCHOFDMSym(int eNBcellConfig0initNrPDCCHOFDMSym) {
		this.eNBcellConfig0initNrPDCCHOFDMSym = eNBcellConfig0initNrPDCCHOFDMSym;
	}
	public long geteNBcellConfig0siConfigsfn() {
		return eNBcellConfig0siConfigsfn;
	}
	public void seteNBcellConfig0siConfigsfn(long eNBcellConfig0siConfigsfn) {
		this.eNBcellConfig0siConfigsfn = eNBcellConfig0siConfigsfn;
	}
	public long geteNBcellConfig0siConfigsib1Length() {
		return eNBcellConfig0siConfigsib1Length;
	}
	public void seteNBcellConfig0siConfigsib1Length(long eNBcellConfig0siConfigsib1Length) {
		this.eNBcellConfig0siConfigsib1Length = eNBcellConfig0siConfigsib1Length;
	}
	public long geteNBcellConfig0siConfigsiWindowLength() {
		return eNBcellConfig0siConfigsiWindowLength;
	}
	public void seteNBcellConfig0siConfigsiWindowLength(long eNBcellConfig0siConfigsiWindowLength) {
		this.eNBcellConfig0siConfigsiWindowLength = eNBcellConfig0siConfigsiWindowLength;
	}
	public long geteNBcellConfig0dlBandwidth() {
		return eNBcellConfig0dlBandwidth;
	}
	public void seteNBcellConfig0dlBandwidth(long eNBcellConfig0dlBandwidth) {
		this.eNBcellConfig0dlBandwidth = eNBcellConfig0dlBandwidth;
	}
	public long geteNBcellConfig0ulBandwidth() {
		return eNBcellConfig0ulBandwidth;
	}
	public void seteNBcellConfig0ulBandwidth(long eNBcellConfig0ulBandwidth) {
		this.eNBcellConfig0ulBandwidth = eNBcellConfig0ulBandwidth;
	}
	public long geteNBcellConfig0ulCyclicPrefixLength() {
		return eNBcellConfig0ulCyclicPrefixLength;
	}
	public void seteNBcellConfig0ulCyclicPrefixLength(long eNBcellConfig0ulCyclicPrefixLength) {
		this.eNBcellConfig0ulCyclicPrefixLength = eNBcellConfig0ulCyclicPrefixLength;
	}
	public long geteNBcellConfig0dlCyclicPrefixLength() {
		return eNBcellConfig0dlCyclicPrefixLength;
	}
	public void seteNBcellConfig0dlCyclicPrefixLength(long eNBcellConfig0dlCyclicPrefixLength) {
		this.eNBcellConfig0dlCyclicPrefixLength = eNBcellConfig0dlCyclicPrefixLength;
	}
	public long geteNBcellConfig0antennaPortsCount() {
		return eNBcellConfig0antennaPortsCount;
	}
	public void seteNBcellConfig0antennaPortsCount(long eNBcellConfig0antennaPortsCount) {
		this.eNBcellConfig0antennaPortsCount = eNBcellConfig0antennaPortsCount;
	}
	public int geteNBcellConfig0duplexMode() {
		return eNBcellConfig0duplexMode;
	}
	public void seteNBcellConfig0duplexMode(int eNBcellConfig0duplexMode) {
		this.eNBcellConfig0duplexMode = eNBcellConfig0duplexMode;
	}
	public int geteNBcellConfig0subframeAssignment() {
		return eNBcellConfig0subframeAssignment;
	}
	public void seteNBcellConfig0subframeAssignment(int eNBcellConfig0subframeAssignment) {
		this.eNBcellConfig0subframeAssignment = eNBcellConfig0subframeAssignment;
	}
	public int geteNBcellConfig0specialSubframePatterns() {
		return eNBcellConfig0specialSubframePatterns;
	}
	public void seteNBcellConfig0specialSubframePatterns(int eNBcellConfig0specialSubframePatterns) {
		this.eNBcellConfig0specialSubframePatterns = eNBcellConfig0specialSubframePatterns;
	}
	public int geteNBcellConfig0prachConfigIndex() {
		return eNBcellConfig0prachConfigIndex;
	}
	public void seteNBcellConfig0prachConfigIndex(int eNBcellConfig0prachConfigIndex) {
		this.eNBcellConfig0prachConfigIndex = eNBcellConfig0prachConfigIndex;
	}
	public long geteNBcellConfig0prachFreqOffset() {
		return eNBcellConfig0prachFreqOffset;
	}
	public void seteNBcellConfig0prachFreqOffset(long eNBcellConfig0prachFreqOffset) {
		this.eNBcellConfig0prachFreqOffset = eNBcellConfig0prachFreqOffset;
	}
	public long geteNBcellConfig0raResponseWindowSize() {
		return eNBcellConfig0raResponseWindowSize;
	}
	public void seteNBcellConfig0raResponseWindowSize(long eNBcellConfig0raResponseWindowSize) {
		this.eNBcellConfig0raResponseWindowSize = eNBcellConfig0raResponseWindowSize;
	}
	public long geteNBcellConfig0macContentionResolutionTimer() {
		return eNBcellConfig0macContentionResolutionTimer;
	}
	public void seteNBcellConfig0macContentionResolutionTimer(long eNBcellConfig0macContentionResolutionTimer) {
		this.eNBcellConfig0macContentionResolutionTimer = eNBcellConfig0macContentionResolutionTimer;
	}
	public int geteNBcellConfig0maxHARQMsg3Tx() {
		return eNBcellConfig0maxHARQMsg3Tx;
	}
	public void seteNBcellConfig0maxHARQMsg3Tx(int eNBcellConfig0maxHARQMsg3Tx) {
		this.eNBcellConfig0maxHARQMsg3Tx = eNBcellConfig0maxHARQMsg3Tx;
	}
	public int geteNBcellConfig0n1PUCCHAN() {
		return eNBcellConfig0n1PUCCHAN;
	}
	public void seteNBcellConfig0n1PUCCHAN(int eNBcellConfig0n1PUCCHAN) {
		this.eNBcellConfig0n1PUCCHAN = eNBcellConfig0n1PUCCHAN;
	}
	public int geteNBcellConfig0deltaPUCCHShift() {
		return eNBcellConfig0deltaPUCCHShift;
	}
	public void seteNBcellConfig0deltaPUCCHShift(int eNBcellConfig0deltaPUCCHShift) {
		this.eNBcellConfig0deltaPUCCHShift = eNBcellConfig0deltaPUCCHShift;
	}
	public int geteNBcellConfig0nRBCqi() {
		return eNBcellConfig0nRBCqi;
	}
	public void seteNBcellConfig0nRBCqi(int eNBcellConfig0nRBCqi) {
		this.eNBcellConfig0nRBCqi = eNBcellConfig0nRBCqi;
	}
	public int geteNBcellConfig0srsSubframeConfig() {
		return eNBcellConfig0srsSubframeConfig;
	}
	public void seteNBcellConfig0srsSubframeConfig(int eNBcellConfig0srsSubframeConfig) {
		this.eNBcellConfig0srsSubframeConfig = eNBcellConfig0srsSubframeConfig;
	}
	public int geteNBcellConfig0srsBwConfig() {
		return eNBcellConfig0srsBwConfig;
	}
	public void seteNBcellConfig0srsBwConfig(int eNBcellConfig0srsBwConfig) {
		this.eNBcellConfig0srsBwConfig = eNBcellConfig0srsBwConfig;
	}
	public int geteNBcellConfig0srsMacUpPts() {
		return eNBcellConfig0srsMacUpPts;
	}
	public void seteNBcellConfig0srsMacUpPts(int eNBcellConfig0srsMacUpPts) {
		this.eNBcellConfig0srsMacUpPts = eNBcellConfig0srsMacUpPts;
	}
	public long geteNBcellConfig0enable64QAM() {
		return eNBcellConfig0enable64QAM;
	}
	public void seteNBcellConfig0enable64QAM(long eNBcellConfig0enable64QAM) {
		this.eNBcellConfig0enable64QAM = eNBcellConfig0enable64QAM;
	}
	public int geteNBcellConfig0carrierIndex() {
		return eNBcellConfig0carrierIndex;
	}
	public void seteNBcellConfig0carrierIndex(int eNBcellConfig0carrierIndex) {
		this.eNBcellConfig0carrierIndex = eNBcellConfig0carrierIndex;
	}
	public long geteNBcellConfig0dlFreq() {
		return eNBcellConfig0dlFreq;
	}
	public void seteNBcellConfig0dlFreq(long eNBcellConfig0dlFreq) {
		this.eNBcellConfig0dlFreq = eNBcellConfig0dlFreq;
	}
	public long geteNBcellConfig0ulFreq() {
		return eNBcellConfig0ulFreq;
	}
	public void seteNBcellConfig0ulFreq(long eNBcellConfig0ulFreq) {
		this.eNBcellConfig0ulFreq = eNBcellConfig0ulFreq;
	}
	public long geteNBcellConfig0eutraBand() {
		return eNBcellConfig0eutraBand;
	}
	public void seteNBcellConfig0eutraBand(long eNBcellConfig0eutraBand) {
		this.eNBcellConfig0eutraBand = eNBcellConfig0eutraBand;
	}
	public long geteNBcellConfig0dlPdschPower() {
		return eNBcellConfig0dlPdschPower;
	}
	public void seteNBcellConfig0dlPdschPower(long eNBcellConfig0dlPdschPower) {
		this.eNBcellConfig0dlPdschPower = eNBcellConfig0dlPdschPower;
	}
	public long geteNBcellConfig0ulPuschPower() {
		return eNBcellConfig0ulPuschPower;
	}
	public void seteNBcellConfig0ulPuschPower(long eNBcellConfig0ulPuschPower) {
		this.eNBcellConfig0ulPuschPower = eNBcellConfig0ulPuschPower;
	}
	public long geteNBcellConfig0sliceConfigdl0id() {
		return eNBcellConfig0sliceConfigdl0id;
	}
	public void seteNBcellConfig0sliceConfigdl0id(long eNBcellConfig0sliceConfigdl0id) {
		this.eNBcellConfig0sliceConfigdl0id = eNBcellConfig0sliceConfigdl0id;
	}
	public String geteNBcellConfig0sliceConfigdl0label() {
		return eNBcellConfig0sliceConfigdl0label;
	}
	public void seteNBcellConfig0sliceConfigdl0label(String eNBcellConfig0sliceConfigdl0label) {
		this.eNBcellConfig0sliceConfigdl0label = eNBcellConfig0sliceConfigdl0label;
	}
	public long geteNBcellConfig0sliceConfigdl0percentage() {
		return eNBcellConfig0sliceConfigdl0percentage;
	}
	public void seteNBcellConfig0sliceConfigdl0percentage(long eNBcellConfig0sliceConfigdl0percentage) {
		this.eNBcellConfig0sliceConfigdl0percentage = eNBcellConfig0sliceConfigdl0percentage;
	}
	public String geteNBcellConfig0sliceConfigdl0isolation() {
		return eNBcellConfig0sliceConfigdl0isolation;
	}
	public void seteNBcellConfig0sliceConfigdl0isolation(String eNBcellConfig0sliceConfigdl0isolation) {
		this.eNBcellConfig0sliceConfigdl0isolation = eNBcellConfig0sliceConfigdl0isolation;
	}
	public long geteNBcellConfig0sliceConfigdl0priority() {
		return eNBcellConfig0sliceConfigdl0priority;
	}
	public void seteNBcellConfig0sliceConfigdl0priority(long eNBcellConfig0sliceConfigdl0priority) {
		this.eNBcellConfig0sliceConfigdl0priority = eNBcellConfig0sliceConfigdl0priority;
	}
	public int geteNBcellConfig0sliceConfigdl0positionLow() {
		return eNBcellConfig0sliceConfigdl0positionLow;
	}
	public void seteNBcellConfig0sliceConfigdl0positionLow(int eNBcellConfig0sliceConfigdl0positionLow) {
		this.eNBcellConfig0sliceConfigdl0positionLow = eNBcellConfig0sliceConfigdl0positionLow;
	}
	public long geteNBcellConfig0sliceConfigdl0positionHigh() {
		return eNBcellConfig0sliceConfigdl0positionHigh;
	}
	public void seteNBcellConfig0sliceConfigdl0positionHigh(long eNBcellConfig0sliceConfigdl0positionHigh) {
		this.eNBcellConfig0sliceConfigdl0positionHigh = eNBcellConfig0sliceConfigdl0positionHigh;
	}
	public long geteNBcellConfig0sliceConfigdl0maxmcs() {
		return eNBcellConfig0sliceConfigdl0maxmcs;
	}
	public void seteNBcellConfig0sliceConfigdl0maxmcs(long eNBcellConfig0sliceConfigdl0maxmcs) {
		this.eNBcellConfig0sliceConfigdl0maxmcs = eNBcellConfig0sliceConfigdl0maxmcs;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting0() {
		return eNBcellConfig0sliceConfigdl0sorting0;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting0(String eNBcellConfig0sliceConfigdl0sorting0) {
		this.eNBcellConfig0sliceConfigdl0sorting0 = eNBcellConfig0sliceConfigdl0sorting0;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting1() {
		return eNBcellConfig0sliceConfigdl0sorting1;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting1(String eNBcellConfig0sliceConfigdl0sorting1) {
		this.eNBcellConfig0sliceConfigdl0sorting1 = eNBcellConfig0sliceConfigdl0sorting1;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting2() {
		return eNBcellConfig0sliceConfigdl0sorting2;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting2(String eNBcellConfig0sliceConfigdl0sorting2) {
		this.eNBcellConfig0sliceConfigdl0sorting2 = eNBcellConfig0sliceConfigdl0sorting2;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting3() {
		return eNBcellConfig0sliceConfigdl0sorting3;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting3(String eNBcellConfig0sliceConfigdl0sorting3) {
		this.eNBcellConfig0sliceConfigdl0sorting3 = eNBcellConfig0sliceConfigdl0sorting3;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting4() {
		return eNBcellConfig0sliceConfigdl0sorting4;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting4(String eNBcellConfig0sliceConfigdl0sorting4) {
		this.eNBcellConfig0sliceConfigdl0sorting4 = eNBcellConfig0sliceConfigdl0sorting4;
	}
	public String geteNBcellConfig0sliceConfigdl0sorting5() {
		return eNBcellConfig0sliceConfigdl0sorting5;
	}
	public void seteNBcellConfig0sliceConfigdl0sorting5(String eNBcellConfig0sliceConfigdl0sorting5) {
		this.eNBcellConfig0sliceConfigdl0sorting5 = eNBcellConfig0sliceConfigdl0sorting5;
	}
	public String geteNBcellConfig0sliceConfigdl0accounting() {
		return eNBcellConfig0sliceConfigdl0accounting;
	}
	public void seteNBcellConfig0sliceConfigdl0accounting(String eNBcellConfig0sliceConfigdl0accounting) {
		this.eNBcellConfig0sliceConfigdl0accounting = eNBcellConfig0sliceConfigdl0accounting;
	}
	public String geteNBcellConfig0sliceConfigdl0schedulerName() {
		return eNBcellConfig0sliceConfigdl0schedulerName;
	}
	public void seteNBcellConfig0sliceConfigdl0schedulerName(String eNBcellConfig0sliceConfigdl0schedulerName) {
		this.eNBcellConfig0sliceConfigdl0schedulerName = eNBcellConfig0sliceConfigdl0schedulerName;
	}
	public int geteNBcellConfig0sliceConfigul0id() {
		return eNBcellConfig0sliceConfigul0id;
	}
	public void seteNBcellConfig0sliceConfigul0id(int eNBcellConfig0sliceConfigul0id) {
		this.eNBcellConfig0sliceConfigul0id = eNBcellConfig0sliceConfigul0id;
	}
	public String geteNBcellConfig0sliceConfigul0label() {
		return eNBcellConfig0sliceConfigul0label;
	}
	public void seteNBcellConfig0sliceConfigul0label(String eNBcellConfig0sliceConfigul0label) {
		this.eNBcellConfig0sliceConfigul0label = eNBcellConfig0sliceConfigul0label;
	}
	public long geteNBcellConfig0sliceConfigul0percentage() {
		return eNBcellConfig0sliceConfigul0percentage;
	}
	public void seteNBcellConfig0sliceConfigul0percentage(long eNBcellConfig0sliceConfigul0percentage) {
		this.eNBcellConfig0sliceConfigul0percentage = eNBcellConfig0sliceConfigul0percentage;
	}
	public String geteNBcellConfig0sliceConfigul0isolation() {
		return eNBcellConfig0sliceConfigul0isolation;
	}
	public void seteNBcellConfig0sliceConfigul0isolation(String eNBcellConfig0sliceConfigul0isolation) {
		this.eNBcellConfig0sliceConfigul0isolation = eNBcellConfig0sliceConfigul0isolation;
	}
	public int geteNBcellConfig0sliceConfigul0priority() {
		return eNBcellConfig0sliceConfigul0priority;
	}
	public void seteNBcellConfig0sliceConfigul0priority(int eNBcellConfig0sliceConfigul0priority) {
		this.eNBcellConfig0sliceConfigul0priority = eNBcellConfig0sliceConfigul0priority;
	}
	public int geteNBcellConfig0sliceConfigul0firstRb() {
		return eNBcellConfig0sliceConfigul0firstRb;
	}
	public void seteNBcellConfig0sliceConfigul0firstRb(int eNBcellConfig0sliceConfigul0firstRb) {
		this.eNBcellConfig0sliceConfigul0firstRb = eNBcellConfig0sliceConfigul0firstRb;
	}
	public long geteNBcellConfig0sliceConfigul0maxmcs() {
		return eNBcellConfig0sliceConfigul0maxmcs;
	}
	public void seteNBcellConfig0sliceConfigul0maxmcs(long eNBcellConfig0sliceConfigul0maxmcs) {
		this.eNBcellConfig0sliceConfigul0maxmcs = eNBcellConfig0sliceConfigul0maxmcs;
	}
	public String geteNBcellConfig0sliceConfigul0accounting() {
		return eNBcellConfig0sliceConfigul0accounting;
	}
	public void seteNBcellConfig0sliceConfigul0accounting(String eNBcellConfig0sliceConfigul0accounting) {
		this.eNBcellConfig0sliceConfigul0accounting = eNBcellConfig0sliceConfigul0accounting;
	}
	public String geteNBcellConfig0sliceConfigul0schedulerName() {
		return eNBcellConfig0sliceConfigul0schedulerName;
	}
	public void seteNBcellConfig0sliceConfigul0schedulerName(String eNBcellConfig0sliceConfigul0schedulerName) {
		this.eNBcellConfig0sliceConfigul0schedulerName = eNBcellConfig0sliceConfigul0schedulerName;
	}
	public String geteNBcellConfig0sliceConfigintrasliceShareActive() {
		return eNBcellConfig0sliceConfigintrasliceShareActive;
	}
	public void seteNBcellConfig0sliceConfigintrasliceShareActive(String eNBcellConfig0sliceConfigintrasliceShareActive) {
		this.eNBcellConfig0sliceConfigintrasliceShareActive = eNBcellConfig0sliceConfigintrasliceShareActive;
	}
	public String geteNBcellConfig0sliceConfigintersliceShareActive() {
		return eNBcellConfig0sliceConfigintersliceShareActive;
	}
	public void seteNBcellConfig0sliceConfigintersliceShareActive(String eNBcellConfig0sliceConfigintersliceShareActive) {
		this.eNBcellConfig0sliceConfigintersliceShareActive = eNBcellConfig0sliceConfigintersliceShareActive;
	}
	public long getUEueConfig0rnti() {
		return UEueConfig0rnti;
	}
	public void setUEueConfig0rnti(long uEueConfig0rnti) {
		UEueConfig0rnti = uEueConfig0rnti;
	}
	public long getUEueConfig0timeAlignmentTimer() {
		return UEueConfig0timeAlignmentTimer;
	}
	public void setUEueConfig0timeAlignmentTimer(long uEueConfig0timeAlignmentTimer) {
		UEueConfig0timeAlignmentTimer = uEueConfig0timeAlignmentTimer;
	}
	public int getUEueConfig0transmissionMode() {
		return UEueConfig0transmissionMode;
	}
	public void setUEueConfig0transmissionMode(int uEueConfig0transmissionMode) {
		UEueConfig0transmissionMode = uEueConfig0transmissionMode;
	}
	public int getUEueConfig0ueAggregatedMaxBitrateUL() {
		return UEueConfig0ueAggregatedMaxBitrateUL;
	}
	public void setUEueConfig0ueAggregatedMaxBitrateUL(int uEueConfig0ueAggregatedMaxBitrateUL) {
		UEueConfig0ueAggregatedMaxBitrateUL = uEueConfig0ueAggregatedMaxBitrateUL;
	}
	public int getUEueConfig0ueAggregatedMaxBitrateDL() {
		return UEueConfig0ueAggregatedMaxBitrateDL;
	}
	public void setUEueConfig0ueAggregatedMaxBitrateDL(int uEueConfig0ueAggregatedMaxBitrateDL) {
		UEueConfig0ueAggregatedMaxBitrateDL = uEueConfig0ueAggregatedMaxBitrateDL;
	}
	public int getUEueConfig0capabilitieshalfDuplex() {
		return UEueConfig0capabilitieshalfDuplex;
	}
	public void setUEueConfig0capabilitieshalfDuplex(int uEueConfig0capabilitieshalfDuplex) {
		UEueConfig0capabilitieshalfDuplex = uEueConfig0capabilitieshalfDuplex;
	}
	public int getUEueConfig0capabilitiesintraSFHopping() {
		return UEueConfig0capabilitiesintraSFHopping;
	}
	public void setUEueConfig0capabilitiesintraSFHopping(int uEueConfig0capabilitiesintraSFHopping) {
		UEueConfig0capabilitiesintraSFHopping = uEueConfig0capabilitiesintraSFHopping;
	}
	public int getUEueConfig0capabilitiestype2Sb1() {
		return UEueConfig0capabilitiestype2Sb1;
	}
	public void setUEueConfig0capabilitiestype2Sb1(int uEueConfig0capabilitiestype2Sb1) {
		UEueConfig0capabilitiestype2Sb1 = uEueConfig0capabilitiestype2Sb1;
	}
	public long getUEueConfig0capabilitiesueCategory() {
		return UEueConfig0capabilitiesueCategory;
	}
	public void setUEueConfig0capabilitiesueCategory(long uEueConfig0capabilitiesueCategory) {
		UEueConfig0capabilitiesueCategory = uEueConfig0capabilitiesueCategory;
	}
	public int getUEueConfig0capabilitiesresAllocType1() {
		return UEueConfig0capabilitiesresAllocType1;
	}
	public void setUEueConfig0capabilitiesresAllocType1(int uEueConfig0capabilitiesresAllocType1) {
		UEueConfig0capabilitiesresAllocType1 = uEueConfig0capabilitiesresAllocType1;
	}
	public long getUEueConfig0ueTransmissionAntenna() {
		return UEueConfig0ueTransmissionAntenna;
	}
	public void setUEueConfig0ueTransmissionAntenna(long uEueConfig0ueTransmissionAntenna) {
		UEueConfig0ueTransmissionAntenna = uEueConfig0ueTransmissionAntenna;
	}
	public int getUEueConfig0ttiBundling() {
		return UEueConfig0ttiBundling;
	}
	public void setUEueConfig0ttiBundling(int uEueConfig0ttiBundling) {
		UEueConfig0ttiBundling = uEueConfig0ttiBundling;
	}
	public long getUEueConfig0maxHARQTx() {
		return UEueConfig0maxHARQTx;
	}
	public void setUEueConfig0maxHARQTx(long uEueConfig0maxHARQTx) {
		UEueConfig0maxHARQTx = uEueConfig0maxHARQTx;
	}
	public int getUEueConfig0betaOffsetACKIndex() {
		return UEueConfig0betaOffsetACKIndex;
	}
	public void setUEueConfig0betaOffsetACKIndex(int uEueConfig0betaOffsetACKIndex) {
		UEueConfig0betaOffsetACKIndex = uEueConfig0betaOffsetACKIndex;
	}
	public int getUEueConfig0betaOffsetRIIndex() {
		return UEueConfig0betaOffsetRIIndex;
	}
	public void setUEueConfig0betaOffsetRIIndex(int uEueConfig0betaOffsetRIIndex) {
		UEueConfig0betaOffsetRIIndex = uEueConfig0betaOffsetRIIndex;
	}
	public long getUEueConfig0betaOffsetCQIIndex() {
		return UEueConfig0betaOffsetCQIIndex;
	}
	public void setUEueConfig0betaOffsetCQIIndex(long uEueConfig0betaOffsetCQIIndex) {
		UEueConfig0betaOffsetCQIIndex = uEueConfig0betaOffsetCQIIndex;
	}
	public int getUEueConfig0ackNackSimultaneousTrans() {
		return UEueConfig0ackNackSimultaneousTrans;
	}
	public void setUEueConfig0ackNackSimultaneousTrans(int uEueConfig0ackNackSimultaneousTrans) {
		UEueConfig0ackNackSimultaneousTrans = uEueConfig0ackNackSimultaneousTrans;
	}
	public int getUEueConfig0simultaneousAckNackCqi() {
		return UEueConfig0simultaneousAckNackCqi;
	}
	public void setUEueConfig0simultaneousAckNackCqi(int uEueConfig0simultaneousAckNackCqi) {
		UEueConfig0simultaneousAckNackCqi = uEueConfig0simultaneousAckNackCqi;
	}
	public long getUEueConfig0aperiodicCqiRepMode() {
		return UEueConfig0aperiodicCqiRepMode;
	}
	public void setUEueConfig0aperiodicCqiRepMode(long uEueConfig0aperiodicCqiRepMode) {
		UEueConfig0aperiodicCqiRepMode = uEueConfig0aperiodicCqiRepMode;
	}
	public int getUEueConfig0ackNackRepetitionFactor() {
		return UEueConfig0ackNackRepetitionFactor;
	}
	public void setUEueConfig0ackNackRepetitionFactor(int uEueConfig0ackNackRepetitionFactor) {
		UEueConfig0ackNackRepetitionFactor = uEueConfig0ackNackRepetitionFactor;
	}
	public int getUEueConfig0pcellCarrierIndex() {
		return UEueConfig0pcellCarrierIndex;
	}
	public void setUEueConfig0pcellCarrierIndex(int uEueConfig0pcellCarrierIndex) {
		UEueConfig0pcellCarrierIndex = uEueConfig0pcellCarrierIndex;
	}
	public long getUEueConfig0imsi() {
		return UEueConfig0imsi;
	}
	public void setUEueConfig0imsi(long uEueConfig0imsi) {
		UEueConfig0imsi = uEueConfig0imsi;
	}
	public int getUEueConfig0dlSliceId() {
		return UEueConfig0dlSliceId;
	}
	public void setUEueConfig0dlSliceId(int uEueConfig0dlSliceId) {
		UEueConfig0dlSliceId = uEueConfig0dlSliceId;
	}
	public int getUEueConfig0ulSliceId() {
		return UEueConfig0ulSliceId;
	}
	public void setUEueConfig0ulSliceId(int uEueConfig0ulSliceId) {
		UEueConfig0ulSliceId = uEueConfig0ulSliceId;
	}
	public int getLCheaderversion() {
		return LCheaderversion;
	}
	public void setLCheaderversion(int lCheaderversion) {
		LCheaderversion = lCheaderversion;
	}
	public long getLCheadertype() {
		return LCheadertype;
	}
	public void setLCheadertype(long lCheadertype) {
		LCheadertype = lCheadertype;
	}
	public int getLCheaderxid() {
		return LCheaderxid;
	}
	public void setLCheaderxid(int lCheaderxid) {
		LCheaderxid = lCheaderxid;
	}
	public long getLClcUeConfig0rnti() {
		return LClcUeConfig0rnti;
	}
	public void setLClcUeConfig0rnti(long lClcUeConfig0rnti) {
		LClcUeConfig0rnti = lClcUeConfig0rnti;
	}
	public int getLClcUeConfig0lcConfig0lcid() {
		return LClcUeConfig0lcConfig0lcid;
	}
	public void setLClcUeConfig0lcConfig0lcid(int lClcUeConfig0lcConfig0lcid) {
		LClcUeConfig0lcConfig0lcid = lClcUeConfig0lcConfig0lcid;
	}
	public int getLClcUeConfig0lcConfig0lcg() {
		return LClcUeConfig0lcConfig0lcg;
	}
	public void setLClcUeConfig0lcConfig0lcg(int lClcUeConfig0lcConfig0lcg) {
		LClcUeConfig0lcConfig0lcg = lClcUeConfig0lcConfig0lcg;
	}
	public long getLClcUeConfig0lcConfig0direction() {
		return LClcUeConfig0lcConfig0direction;
	}
	public void setLClcUeConfig0lcConfig0direction(long lClcUeConfig0lcConfig0direction) {
		LClcUeConfig0lcConfig0direction = lClcUeConfig0lcConfig0direction;
	}
	public int getLClcUeConfig0lcConfig0qosBearerType() {
		return LClcUeConfig0lcConfig0qosBearerType;
	}
	public void setLClcUeConfig0lcConfig0qosBearerType(int lClcUeConfig0lcConfig0qosBearerType) {
		LClcUeConfig0lcConfig0qosBearerType = lClcUeConfig0lcConfig0qosBearerType;
	}
	public int getLClcUeConfig0lcConfig0qci() {
		return LClcUeConfig0lcConfig0qci;
	}
	public void setLClcUeConfig0lcConfig0qci(int lClcUeConfig0lcConfig0qci) {
		LClcUeConfig0lcConfig0qci = lClcUeConfig0lcConfig0qci;
	}
	public long getLClcUeConfig0lcConfig1lcid() {
		return LClcUeConfig0lcConfig1lcid;
	}
	public void setLClcUeConfig0lcConfig1lcid(long lClcUeConfig0lcConfig1lcid) {
		LClcUeConfig0lcConfig1lcid = lClcUeConfig0lcConfig1lcid;
	}
	public int getLClcUeConfig0lcConfig1lcg() {
		return LClcUeConfig0lcConfig1lcg;
	}
	public void setLClcUeConfig0lcConfig1lcg(int lClcUeConfig0lcConfig1lcg) {
		LClcUeConfig0lcConfig1lcg = lClcUeConfig0lcConfig1lcg;
	}
	public long getLClcUeConfig0lcConfig1direction() {
		return LClcUeConfig0lcConfig1direction;
	}
	public void setLClcUeConfig0lcConfig1direction(long lClcUeConfig0lcConfig1direction) {
		LClcUeConfig0lcConfig1direction = lClcUeConfig0lcConfig1direction;
	}
	public int getLClcUeConfig0lcConfig1qosBearerType() {
		return LClcUeConfig0lcConfig1qosBearerType;
	}
	public void setLClcUeConfig0lcConfig1qosBearerType(int lClcUeConfig0lcConfig1qosBearerType) {
		LClcUeConfig0lcConfig1qosBearerType = lClcUeConfig0lcConfig1qosBearerType;
	}
	public int getLClcUeConfig0lcConfig1qci() {
		return LClcUeConfig0lcConfig1qci;
	}
	public void setLClcUeConfig0lcConfig1qci(int lClcUeConfig0lcConfig1qci) {
		LClcUeConfig0lcConfig1qci = lClcUeConfig0lcConfig1qci;
	}
	public long getLClcUeConfig0lcConfig2lcid() {
		return LClcUeConfig0lcConfig2lcid;
	}
	public void setLClcUeConfig0lcConfig2lcid(long lClcUeConfig0lcConfig2lcid) {
		LClcUeConfig0lcConfig2lcid = lClcUeConfig0lcConfig2lcid;
	}
	public int getLClcUeConfig0lcConfig2lcg() {
		return LClcUeConfig0lcConfig2lcg;
	}
	public void setLClcUeConfig0lcConfig2lcg(int lClcUeConfig0lcConfig2lcg) {
		LClcUeConfig0lcConfig2lcg = lClcUeConfig0lcConfig2lcg;
	}
	public int getLClcUeConfig0lcConfig2direction() {
		return LClcUeConfig0lcConfig2direction;
	}
	public void setLClcUeConfig0lcConfig2direction(int lClcUeConfig0lcConfig2direction) {
		LClcUeConfig0lcConfig2direction = lClcUeConfig0lcConfig2direction;
	}
	public int getLClcUeConfig0lcConfig2qosBearerType() {
		return LClcUeConfig0lcConfig2qosBearerType;
	}
	public void setLClcUeConfig0lcConfig2qosBearerType(int lClcUeConfig0lcConfig2qosBearerType) {
		LClcUeConfig0lcConfig2qosBearerType = lClcUeConfig0lcConfig2qosBearerType;
	}
	public int getLClcUeConfig0lcConfig2qci() {
		return LClcUeConfig0lcConfig2qci;
	}
	public void setLClcUeConfig0lcConfig2qci(int lClcUeConfig0lcConfig2qci) {
		LClcUeConfig0lcConfig2qci = lClcUeConfig0lcConfig2qci;
	}
	public long getMac_stats_total_bytes_sdus_ul() {
		return mac_stats_total_bytes_sdus_ul;
	}
	public void setMac_stats_total_bytes_sdus_ul(long mac_stats_total_bytes_sdus_ul) {
		this.mac_stats_total_bytes_sdus_ul = mac_stats_total_bytes_sdus_ul;
	}
	public long getMac_stats_total_bytes_sdus_dl() {
		return mac_stats_total_bytes_sdus_dl;
	}
	public void setMac_stats_total_bytes_sdus_dl(long mac_stats_total_bytes_sdus_dl) {
		this.mac_stats_total_bytes_sdus_dl = mac_stats_total_bytes_sdus_dl;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
		
	
}
