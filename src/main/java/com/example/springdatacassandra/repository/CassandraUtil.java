package com.example.springdatacassandra.repository;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraUtil {

     private  static Cluster cluster;
     static Cluster getCluster(){
         if (null ==cluster){
              cluster = Cluster.builder()
                     .withClusterName("myCluster")
                     .addContactPoint("127.0.0.1")
                     .build();
              return cluster;
         }
         return  cluster;
     }
     static Session getSession()
     {
         if(null ==cluster){
             if (!cluster.isClosed()){
                 return cluster.connect();
             }
             return cluster.connect();
         }

         return  cluster.connect();
     }
}
