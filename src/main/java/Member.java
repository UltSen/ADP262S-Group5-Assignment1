/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Senzo Stofile - 219345406
 */
public class Member {
  private String member, id, branch;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getMember(){
        return member;
    }
    
    public void setMember(String member){
        this.member = member;
    }
    
    public String getBranch(String branch){
        return branch;
    }
    
    public void setBranch(String branch){
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Calculate{" + "member=" + member + ", id=" + id + ", branch=" + branch + '}';
    }  
}
