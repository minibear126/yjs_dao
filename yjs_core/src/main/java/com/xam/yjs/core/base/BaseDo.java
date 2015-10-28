package com.xam.yjs.core.base;

import java.io.Serializable;
import java.util.Date;

/*
 import org.springframework.security.core.context.SecurityContextHolder;
 import org.springframework.security.core.userdetails.UserDetails;

 */
public class BaseDo extends BaseBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 3737724864093468401L;

    private Date              CREATE_DATE;

    private Date              LAST_DATE;

    public BaseDo()
    {
        /*
         * if( SecurityContextHolder.getContext() .getAuthentication() !=null){
         * 
         * Object user =
         * SecurityContextHolder.getContext().getAuthentication().getPrincipal
         * (); if(user instanceof UserDetails){ this.userNameLast =
         * ((UserDetails)user).getUsername(); }else if(user instanceof String){
         * this.userNameLast = (String)user; } }
         */
    }

    public Date getCREATE_DATE()
    {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date cREATE_DATE)
    {
        CREATE_DATE = cREATE_DATE;
    }

    public Date getLAST_DATE()
    {
        return LAST_DATE;
    }

    public void setLAST_DATE(Date lAST_DATE)
    {
        LAST_DATE = lAST_DATE;
    }
}
