package com.demo.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonDetails {
	
	private List<Object> list;
	private Map<Object, Object> map;
	private Set<Object> set;
	private Properties props;
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public Set<Object> getSet() {
		return set;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "PersonDetails [list " + list+ " , set " + set+ ", map " + map+ ", props "+ props +"]";
	}
	

}
