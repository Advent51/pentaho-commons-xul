package org.pentaho.ui.xul.gwt;

import org.pentaho.ui.xul.XulContainer;
import org.pentaho.ui.xul.util.Align;

public abstract class AbstractGwtXulContainer extends AbstractGwtXulComponent implements XulContainer{

  protected Align alignment;
  
  public AbstractGwtXulContainer(String tagName){
    super(tagName);
  }
  
  

  public void setAlign(String align) {
    try{
      this.alignment = Align.valueOf(align.toUpperCase());
    } catch(Exception e){
      System.out.println("Cannot parse ["+align+"] as Align value");
      
    }
  }
  
  public Align getAlign(){
    return this.alignment;
  }
}

  