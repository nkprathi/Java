package com.may.fifteen.chainres;


	public class Chain
	{
	Processor chain;
	  
	public Chain(){
	    buildChain();
	}
	  
	private void buildChain(){
	    chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
	}
	  
	public void process(Number number) {
	    chain.process(number);
	}
	  
	}
	abstract class Processor 
	{ 
	    private Processor nextProcessor;
	  
	    public Processor(Processor nextProcessor){
	        this.nextProcessor = nextProcessor;
	    };
	      
	    public void process(Number number){
	        if(nextProcessor != null)
	            nextProcessor.process(number);
	    }; 
	} 
	
	  
	
	  
	
