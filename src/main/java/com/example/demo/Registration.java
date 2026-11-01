package com.example.demo;
public class Registration{
        private String id;
        private String name;
        private String email;
        private String eventName;
    public Registration(){
    }
        public Registration(String id,String name,String email,String eventName){
            this.id=id;
            this.name=name;
            this.email=email;
            this.eventName=eventName;
        }
        public String getId(){
              return this.id;
        }
        public void setId(String id){
            this.id=id;
        }
           public String getName(){
              return this.name;
        }
        public void setName(String name){
            this.name=name;
        }
         public String getEmail(){
              return this.email;
        }
        public void setEmail(String email){
            this.email=email;
        }
         public String getEventName(){
              return this.eventName;
        }
        public void setEventName(String eventName){
            this.eventName=eventName;
        }
    
}