package org.github.etcd.rest;

import java.util.List;

public class EtcdMember {
    private String id;
    private String name;
    private List<String> peerURLs;
    private List<String> clientURLs;
    private String state;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPeerURLs() {
        return peerURLs;
    }
    public void setPeerURLs(List<String> peerURLs) {
        this.peerURLs = peerURLs;
    }
    public List<String> getClientURLs() {
        return clientURLs;
    }
    public void setClientURLs(List<String> clientURLs) {
        this.clientURLs = clientURLs;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "EtcdMember [id=" + id + ", name=" + name + ", peerURLs="
                + peerURLs + ", clientURLs=" + clientURLs + ", state=" + state
                + "]";
    }
}
