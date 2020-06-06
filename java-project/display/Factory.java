package edu.nyu.cs9053.homework9;
import java.util.concurrent.Semaphore;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.lang.UnsupportedOperationException;
import java.lang.Exception;
import java.lang.InterruptedException;

/**
 * User: blangel
 */
public class Factory {

	private static final Semaphore sem = new Semaphore(1);
	// we need to make sure all operations on queue is from the same semephore

    public static Customer createCustomer() throws UnsupportedOperationException {
    		Customer customer = new Jerry(sem);
            return customer;
            // remove try-catch block
    }


    public static Barista createBarista() throws UnsupportedOperationException {
            Barista barista = new Tom(sem);
            return barista;
            // remove try-catch block

    }


    public final static class Jerry implements Customer { 
        // correlation: add final
        // change to private to encapsulate this
        // or public but private the constructor so that others can't initialize it
	    private final CheeseLatte drink = new CheeseLatte();
	    private final Semaphore sem;
	    // adding final keyword

	    private Jerry(Semaphore sem) {
		    this.sem = sem;
	    }

        @Override
	    public OrderNumber order(Queue queue) {
		    try {
		    	sem.acquire();
		    	// changed indent length to 4
			}
			catch (InterruptedException semNotavailable) {
				System.out.println("Other people using the queue please wait");
                // correction
                Thread.currentThread().interrupt();// so you won't release the semaphore you don't have
                throw new RuntimeException(semNotavailable);
                // correction
			}
		    finally {
		    	sem.release();
		    	// released in final block
		    }
		    if (queue.full()) {
				    return null;
			} else {
			return queue.addOrder(drink);
		    }

		    
	    }
    }

    public final static class Tom implements Barista {
	    final private Semaphore sem;

	    private Tom(Semaphore sem) {
		    this.sem = sem;
	    }

        @Override
	    public OrderNumber handle(Queue from) {
		    try {
			    sem.acquire();
			}
			catch (InterruptedException semNotavailable) {
				System.out.println("Other people using the queue please wait");
				Thread.currentThread().interrupt();// so you won't release the semaphore you don't have
                throw new RuntimeException(semNotavailable);
			}

			try {
			    if (from.isEmpty()) {
				    return null;
			    }
			    return from.getOrderNumber();
		    }
		    catch (UnsupportedOperationException waitBrista) {
                System.out.println("The queue is empty can't operate sorry");
                return null;
		    }
		    finally {
		    	sem.release();
		    }
		    
	    }
    }

   // move the CheeseLatte class to another .java file

}

