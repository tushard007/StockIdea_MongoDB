package com.stock.stockidea.entity;


import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "StockResearch")
public class StockIdea {
    @Id
    private String id;
    private String suggestedBy;
    private String infoSource;
    private String theme;
    private String comments;
    private Date dateCreated;
    private Date timestamp;
   private List<String> companyNames;
}