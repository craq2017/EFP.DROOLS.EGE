package ru.mos.efp.efp.drools.ege;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class Error implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String type;
   private java.lang.String text;

   public Error()
   {
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getText()
   {
      return this.text;
   }

   public void setText(java.lang.String text)
   {
      this.text = text;
   }

   public Error(java.lang.String type, java.lang.String text)
   {
      this.type = type;
      this.text = text;
   }

}