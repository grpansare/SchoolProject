package com.sms.models;



public class JwtResponse {
    private String jwtToken;
    private String username;
    Builder builder;
	public JwtResponse() {
		// TODO Auto-generated constructor stub
	}
	  public JwtResponse  (Builder builder)
	    {
	        this.jwtToken = builder.jwtToken;
	        this.username = builder.username;
	       
	    }
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public JwtResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}
    public static class Builder {
        private String jwtToken;
        private String username;
        /// instance fields
      
        public static Builder newInstance()
        {
            return new Builder();
        }
        
 
        private Builder() {}
 
        // Setter methods
        public Builder setId(String jwtToken)
        {
            this.jwtToken = jwtToken;
            return this;
        }
        public Builder setName(String username)
        {
            this.username = username;
            return this;
        }
       
 
        // build method to deal with outer class
        // to return outer instance
        public JwtResponse build()
        {
            return new JwtResponse(this);
        }
    }
	

}
