package com.epam.training.SunnatillaSamatov.nestedclasses.contactbook;


import java.util.Arrays;

public class Contact {
    private String name;
    private NameContactInfo contactName = new NameContactInfo();
    private ContactInfo phoneNumber;
    private  Email[] emails = new Email[3];
    private  Social[] socials = new Social[5];
    public Contact(String contactName) {
        this.name=contactName;

    }

    public void rename(String newName) {
        if(name!=null && newName!=null && !newName.isEmpty()) name=newName;

    }
    private class NameContactInfo implements ContactInfo{

        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return name;
        }
    }

    public static class Email implements ContactInfo{
        String email;
        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return email;
        }
    }

    public static class Social implements ContactInfo{
        private String id;
        private String title;

        public Social(String id, String title){
            this.id=id;
            this.title=title;
        }
        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return id;
        }
    }
    public Email addEmail(String localPart, String domain) {
        if(emails[2]!=null) return null;
        else{
            Email newEmail = new Email();
            for (int i=0; i<emails.length;i++) {
                if(emails[i]==null){
                    newEmail.email=localPart+"@"+domain;
                    emails[i]=newEmail;
                    break;
                }
            }
            return newEmail;
        }

    }


    public Email addEpamEmail(String firstname, String lastname) {
        if(emails[2]!=null) return null;
        else {
            Email epamEmail= new Email() {
                String email=firstname+"_"+lastname+"@epam.com";
                @Override
                public String getTitle() {
                    return "Epam Email";
                }

                @Override
                public String getValue() {
                    return email;
                }
            };
            for (int i=0;i<emails.length;i++) {
                if(emails[i]==null){

                    emails[i]=epamEmail;
                    break;
                }
            }

            return epamEmail;
        }

    }

    public ContactInfo addPhoneNumber(int code, String number) {
         ContactInfo contactInfo = new ContactInfo() {
            String telNumber="+"+code+" "+number;
            @Override
            public String getTitle() {
                return "Tel";
            }

            @Override
            public String getValue() { return telNumber;}
        };

        if(phoneNumber==null){
            phoneNumber=contactInfo;
            return phoneNumber;
        }else return null;
    }

    public Social addTwitter(String twitterId) {
        Social twitter = new Social(twitterId, "Twitter");
        boolean flag = false;
        for (int i=0; i<socials.length;i++){
            if(socials[i]==null){
                 socials[i]=twitter;
                 flag=true;
                 break;
            }
        }
        if(flag) return twitter;
        else return null;
    }

    public Social addInstagram(String instagramId) {
        Social instagram = new Social(instagramId, "Instagram");
        boolean flag = false;
        for (int i=0; i<socials.length;i++){
            if(socials[i]==null){
                socials[i]=instagram;
                flag=true;
                break;
            }
        }
        if(flag) return instagram;
        else return null;
    }

    public Social addSocialMedia(String title, String id) {
        Social socialMedia = new Social(id, title);
        boolean flag = false;
        for (int i=0; i<socials.length;i++){
            if(socials[i]==null){
                socials[i]=socialMedia;
                flag=true;
                break;
            }
        }
        if(flag) return socialMedia;
        else return null;
    }

    public ContactInfo[] getInfo() {
        int lengthEmail = this.findNotNullIndexEmail(emails);
        boolean emailBool= false;
        int lengthSocial = this.findNotnullIndexSocial(socials);
        boolean socialBool = false;
        int thePhoneNumber=0;
        int lengthName=1;
        if(phoneNumber!=null) thePhoneNumber=1;
        ContactInfo[] contactInfo = new ContactInfo[lengthName+thePhoneNumber+lengthEmail+lengthSocial];
        for (int i = 0; i<lengthName+thePhoneNumber+lengthEmail+lengthSocial ; i++){

            if(contactName!=null && lengthName==1) {
                lengthName=2;contactInfo[i]=contactName;
            } else if (phoneNumber!=null && thePhoneNumber==1) {
                thePhoneNumber =2; contactInfo[i]=phoneNumber;

            } else if (lengthEmail>0 && !emailBool) {
                emailBool=true;
                System.arraycopy(emails,0,contactInfo,i,lengthEmail);

            } else if (lengthSocial>0 && lengthEmail==0 && !socialBool) {
                socialBool=true;
                System.arraycopy(socials,0,contactInfo,i,lengthSocial);

            }else if(lengthSocial>0 && emailBool &&  !socialBool){

                socialBool=true;

                System.arraycopy(socials,0,contactInfo,i+lengthEmail-1,lengthSocial);

            }
        }

        return contactInfo;
    }

    public int findNotNullIndexEmail(Email[] array){
        int index= array.length;

        for (int i=0; i<array.length; i++) {
            if(array[i]==null) {
                index=i;
                break;
            }

        }
        return index;
    }

    public int findNotnullIndexSocial(Social[] array){
        int index= array.length;

        for (int i=0; i<array.length; i++) {
            if(array[i]==null) {
                index=i;

                break;
            }

        }

        return index;
    }
}
