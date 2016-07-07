package br.com.zup.domain;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User{
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String name;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Document> documents;
    
    public User(){}
    
    public User(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<Document> getDocuments(){
        return this.documents;
    }
    
    public void setDocument(Document document){
        if(this.documents == null){
            this.documents = new ArrayList<>();
        }
        this.documents.add(document);
    }
    
    @Override
    public String toString(){
        return "name: " + this.name;
    }
}
