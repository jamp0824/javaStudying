package com.kt.test.its;

public class ItsVO {
	
	private String type="";
	private String eventid = "";
	private String eventtype = "";
	private double coordx;
	private double coordy;
	private String lanesblocktype = "";
	private String lanesblocked = "";
	private String eventstartday = "";
	private String eventendday = "";
	private String eventstarttime = "";
	private String eventendtime = "";
	private String eventstatusmsg = "";
	private int expectedcnt;
	private String expecteddetourmsg = "";
	private String eventdirection = "";
	
	public ItsVO(String type, String eventid, String eventtype, double coordx, double coordy, String lanesblocktype,
			String lanesblocked, String eventstartday, String eventendday, String eventstarttime, String eventendtime,
			String eventstatusmsg, int expectedcnt, String expecteddetourmsg, String eventdirection) {
		super();
		this.type = type;
		this.eventid = eventid;
		this.eventtype = eventtype;
		this.coordx = coordx;
		this.coordy = coordy;
		this.lanesblocktype = lanesblocktype;
		this.lanesblocked = lanesblocked;
		this.eventstartday = eventstartday;
		this.eventendday = eventendday;
		this.eventstarttime = eventstarttime;
		this.eventendtime = eventendtime;
		this.eventstatusmsg = eventstatusmsg;
		this.expectedcnt = expectedcnt;
		this.expecteddetourmsg = expecteddetourmsg;
		this.eventdirection = eventdirection;
	}
	@Override
	public String toString() {
		return "ItsVO [type=" + type + ", eventid=" + eventid + ", eventtype=" + eventtype + ", coordx=" + coordx
				+ ", coordy=" + coordy + ", lanesblocktype=" + lanesblocktype + ", lanesblocked=" + lanesblocked
				+ ", eventstartday=" + eventstartday + ", eventendday=" + eventendday + ", eventstarttime="
				+ eventstarttime + ", eventendtime=" + eventendtime + ", eventstatusmsg=" + eventstatusmsg
				+ ", expectedcnt=" + expectedcnt + ", expecteddetourmsg=" + expecteddetourmsg + ", eventdirection="
				+ eventdirection + "]";
	}
	public String getEventendday() {
		return eventendday;
	}
	public void setEventendday(String eventendday) {
		this.eventendday = eventendday;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEventid() {
		return eventid;
	}
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public double getCoordx() {
		return coordx;
	}
	public void setCoordx(double coordx) {
		this.coordx = coordx;
	}
	public double getCoordy() {
		return coordy;
	}
	public void setCoordy(double coordy) {
		this.coordy = coordy;
	}
	public String getLanesblocktype() {
		return lanesblocktype;
	}
	public void setLanesblocktype(String lanesblocktype) {
		this.lanesblocktype = lanesblocktype;
	}
	public String getLanesblocked() {
		return lanesblocked;
	}
	public void setLanesblocked(String lanesblocked) {
		this.lanesblocked = lanesblocked;
	}
	public String getEventstartday() {
		return eventstartday;
	}
	public void setEventstartday(String eventstartday) {
		this.eventstartday = eventstartday;
	}
	public String getEventstarttime() {
		return eventstarttime;
	}
	public void setEventstarttime(String eventstarttime) {
		this.eventstarttime = eventstarttime;
	}
	public String getEventendtime() {
		return eventendtime;
	}
	public void setEventendtime(String eventendtime) {
		this.eventendtime = eventendtime;
	}
	public String getEventstatusmsg() {
		return eventstatusmsg;
	}
	public void setEventstatusmsg(String eventstatusmsg) {
		this.eventstatusmsg = eventstatusmsg;
	}
	public int getExpectedcnt() {
		return expectedcnt;
	}
	public void setExpectedcnt(int expectedcnt) {
		this.expectedcnt = expectedcnt;
	}
	public String getExpecteddetourmsg() {
		return expecteddetourmsg;
	}
	public void setExpecteddetourmsg(String expecteddetourmsg) {
		this.expecteddetourmsg = expecteddetourmsg;
	}
	public String getEventdirection() {
		return eventdirection;
	}
	public void setEventdirection(String eventdirection) {
		this.eventdirection = eventdirection;
	}
	
	public ItsVO(){};
}
