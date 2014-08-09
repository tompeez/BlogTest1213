package de.hahn.blog.test1213.view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class DynamicRegionBean implements Serializable {
    private String taskFlowId = "/WEB-INF/de/hahn/blog/test1213/department/department-btf.xml#department-btf";

    public DynamicRegionBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
}
