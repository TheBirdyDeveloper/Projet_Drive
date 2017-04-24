package com.unidrive.drive_service;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"liste"
})
public class ListFileTranslator {

@JsonProperty("liste")
private List<FileTranslator> liste = null;

public ListFileTranslator() {
	// TODO Auto-generated constructor stub
	liste = new ArrayList<FileTranslator>();
}

@JsonProperty("liste")
public List<FileTranslator> getListe() {
return liste;
}

@JsonProperty("liste")
public void setListe(List<FileTranslator> liste) {
this.liste = liste;
}

public void add(FileTranslator file) {
this.liste.add(file);
}

}