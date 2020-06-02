package com.sysoiev.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    List documentList;
    Set documentSet;
    Map documentMap;
    Properties documentProperties;

    public List getDocumentList() {
        System.out.println("List of documents: " + documentList);
        return documentList;
    }

    public void setDocumentList(List documentList) {

        this.documentList = documentList;
    }

    public Set getDocumentSet() {
        System.out.println("Set of documents: " + documentSet);
        return documentSet;
    }

    public void setDocumentSet(Set documentSet) {
        this.documentSet = documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("Map of documents: " + documentMap);
        return documentMap;
    }

    public void setDocumentMap(Map documentMap) {
        this.documentMap = documentMap;
    }

    public Properties getDocumentProperties() {
        System.out.println("Properties of documents: " + documentProperties);
        return documentProperties;
    }

    public void setDocumentProperties(Properties documentProperties) {
        this.documentProperties = documentProperties;
    }

}
