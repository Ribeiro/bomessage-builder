package com.calypso.tk.bo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;


public class BOMessageBuilderTest {
	
	private static final String NEW = "NEW";
	private static final String NONE = "NONE";
	private static final String DD_MMM_YYYY = "dd MMM yyyy";
	private static DateFormat formatter = new SimpleDateFormat(DD_MMM_YYYY);
	
	@Test
	public void shouldCreateBOMessageWithTodaysDate(){
		Date currentDate = new Date();
		BOMessage boMessage = new BOMessageBuilder().forToday().build();
		assertThat(assertEqualDates(boMessage.getCreationDate(), currentDate), is(true));
	}
	
	@Test
	public void shouldCreateBOMessageWithTodaysDateAndStatusNone(){
		Date currentDate = new Date();
		BOMessage boMessage = new BOMessageBuilder().withStatus(NONE).forToday().build();
		assertThat(assertEqualDates(boMessage.getCreationDate(), currentDate), is(true));
		assertThat(boMessage.getStatus(), is(NONE));
	}
	
	@Test
	public void shouldCreateBOMessageWithTodaysDateAndActionNew(){
		Date currentDate = new Date();
		BOMessage boMessage = new BOMessageBuilder().withAction(NEW).forToday().build();
		assertThat(assertEqualDates(boMessage.getCreationDate(), currentDate), is(true));
		assertThat(boMessage.getAction(), is(NEW));
	}
	
	@Test
	public void shouldCreateBOMessageWithGivenDate(){
		Date currentDate = new Date();
		BOMessage boMessage = new BOMessageBuilder().withDate(new Date()).build();
		assertThat(assertEqualDates(boMessage.getCreationDate(), currentDate), is(true));
	}
	
	private static boolean assertEqualDates(Date date1, Date date2) {
        String d1 = formatter.format(date1);            
        String d2 = formatter.format(date2);            
        return d1.equals(d2);
    } 

}
