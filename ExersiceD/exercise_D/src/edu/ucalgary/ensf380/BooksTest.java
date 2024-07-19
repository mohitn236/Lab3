// Content of BooksTest . java
package edu.ucalgary.ensf380;

//import static org.junit.jupiter.api.Assertions.fail;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assume.*;
import static org.junit.Assert.*;
import java.util.Arrays;
//import org.junit.jupiter.api.extension.ExtendWith;
import jdk.jfr.Timestamp;
import java.lang.reflect.Method;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import ca.ucalgary.ensf380.Anthology;
import ca.ucalgary.ensf380.Nonfiction;
import ca.ucalgary.ensf380.Novel;

/*
19 The following are a selection of tests to get you started with checking
your Books . java implementation . Feel free to add your own !
*/

public class BooksTest {

String isbn = " 0987654321 " ;
int pages = 10;

public BooksTest() {
}

@Test
public void checkRelationship_AnthologyCoverArt(){
Anthology anthology = new Anthology(isbn, pages, pages, isbn, isbn, isbn, null);
String expected = " Method coverArt called from Anthology " ;
assertEquals ( "Expected statement was not returned from coverArt () in the Anthology class : " , expected, anthology.getCoverArt());
 }

@Test
public void testAnthology_DefaultConstructor() {
    Anthology newAnthology = new Anthology(isbn, pages, pages, isbn, isbn, isbn, null);
    assertNotNull("Default constructor failed, new Anthology object is null:", newAnthology);
}

@Test
public void testAnthology_InheritedConstructor(){

Anthology newAnthology = new Anthology(isbn, pages, pages, isbn, isbn, isbn, null);
assertNotNull ( " Inherited constructor failed , new Anthology object is null : " , newAnthology ) ;
 }

@Test
public void testPaperbackCoverArt () {


Nonfiction newNF = new Nonfiction (isbn, pages, pages, null) ;
String expected = " Method coverArt called from Paperback " ;
assertEquals ("Expected statement was not returned from coverArt () in the Paperback class : " , expected , newNF.getCoverArt());

 }

@Test
public void checkRelationship_NovelCoverArt(){
	
Novel novel = new Novel(isbn, pages, pages, isbn, isbn, null, null);
String expected = " Method coverArt called from Novel " ;
assertEquals ( " Expected statement was not returned from coverArt () in the Novel class : " , expected , novel.getCoverArt());
}


@Test
public void testFictionGenre() {

Anthology antho = new Anthology(isbn, pages, pages, isbn, isbn, isbn, null);
String expected = "Method genre called from Fiction";
assertEquals ("Expected statement was not returned from genre () in the Fiction class : " , expected , antho.getGenre());
}

@Test
public void checkRelationship_NonfictionTopic() {
	
Nonfiction nonfiction = new Nonfiction(isbn, pages, pages, null);
String expected = " Method topic called from Nonfiction " ;
assertEquals ( " Expected statement was not returned from topic () in the Nonfiction class : " ,expected, nonfiction.topic());
}

}
