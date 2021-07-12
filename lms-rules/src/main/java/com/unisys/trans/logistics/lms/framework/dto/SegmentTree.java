package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;

public class SegmentTree {
    
    private SegmentTree parent;
    
    private List<SegmentTree> children;
    
    private String station;

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public SegmentTree getParent() {
        return parent;
    }

    public void setParent(SegmentTree parent) {
        this.parent = parent;
    }

    public List<SegmentTree> getChildren() {
        
        if (this.children == null) {
            
            children = new ArrayList<SegmentTree>();
            
        }
        
        return children;
    }

    public void setChildren(List<SegmentTree> pChildren) {
        
        this.children = pChildren;
    }       

}
