# Fun: A Starbucks that Free of Producer / Consumer Problem
This is a fun project of avoiding the classic "Producer / Consumer" problem when multiple threads need to share the same resource. <br/>
<br/>
"Producer / Consumer" problem means there’s a producer and a consumer sharing a fixed sized buffer. The job of the producer is to create data to put into the buffer. The job of the consumer is to remove data from the buffer. The problem is to ensure the producer does not put data into a full buffer and the consumer does not try to remove data from an empty buffer.<br/>
<br/>
In this project, we create an orderly Starbucks with the implementation of interface <i>Customer</i> and <i>Barista</i>, which act as producer and consumer. Here we use Java Semaphore to avoid <i>Customer</i> implementation adds order into a full quene, or <i>Barista</i> removes order from an empty quene, as well as these actions don't happen at the same time. <br/>
<br/>
By avoiding "Producer / Consumer" problem, our <i>Starbucks</i> can run forever. The source code can be viewed <a href="https://github.com/hhongjiang/hhongjiang.github.io/tree/master/java-project/display">here</a>.<br/>
<br/>
Here is part fo the screen recording of the program running:<br/>
<br/>
<br/>
<img src="java-project.gif">