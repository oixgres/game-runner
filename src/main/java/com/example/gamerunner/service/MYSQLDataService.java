package com.example.gamerunner.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MYSQLDataServiceQualifier")
public class MYSQLDataService implements  DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
