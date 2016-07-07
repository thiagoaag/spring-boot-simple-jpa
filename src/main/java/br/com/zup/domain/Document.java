package br.com.zup.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Document{
    
    @Id
    @GeneratedValue
    private Long Id;
    
    private String value;
    
    public Document(){}
    
    public Document(String value){
        this.value = value;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
