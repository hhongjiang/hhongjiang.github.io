# OSPF with FRRouting and Docker Lab Report
## Software Requirement
In this report, I documented how I built OSPF network and performed network experiments under Ubuntu 16.04 system. The following software suites are used:
* FRRouting. 
 * [Installation from source]("http://docs.frrouting.org/en/latest/installation.html#from-packages")
 * [Image from cumulusnetworks]("https://hub.docker.com/r/cumulusnetworks/frrouting")
* Docker containers. 
 * [Installation]("https://docs.docker.com/install/linux/docker-ce/ubuntu/")


## TASK 1
Create the following topology and run ospf<br/>
<br/>
<img src="topology1.jpg">
<br/>
And for each container, show<br/>
* ospf neighbors
* ospf routes
* ip routes<br/>
<br/>
And then, show you can successfully, <br/>
* R1 ping R2
* R4 ping R2

### FRR1
#### OSPF Neighbors
<img src="task1-frr1-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task1-frr1-ospf-routes.jpg">

#### IP Routes
<img src="task1-frr1-ospf-iproutes.jpg">

### FRR2
#### OSPF Neighbors
<img src="task1-frr2-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task1-frr2-ospf-routes.jpg">

#### IP Routes
<img src="task1-frr2-ospf-iproutes.jpg">

### FRR3
#### OSPF Neighbors
<img src="task1-frr3-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task1-frr3-ospf-routes.jpg">

#### IP Routes
<img src="task1-frr3-ospf-iproutes.jpg">

### FRR4
#### OSPF Neighbors
<img src="task1-frr4-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task1-frr4-ospf-routes.jpg">

#### IP Routes
<img src="task1-frr4-ospf-iproutes.jpg">

### FRR5
#### OSPF Neighbors
<img src="task1-frr5-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task1-frr5-ospf-routes.jpg">

#### IP Routes
<img src="task1-frr5-ospf-iproutes.jpg">

### R1 ping R2
<img src="task1-r1-ping-r2.jpg">

### R4 ping R2
<img src="task1-r4-ping-r2.jpg">

## TASK2
Create the following topology and run ospf with link cost
<br/>
<img src="topology2.jpg">
<br/>
And for each container, show<br/>
* ospf neighbors
* ospf routes
* ip routes<br/>
<br/>
And then, show you can successfully, <br/>
* R1 ping R2
* R4 ping R2

### FRR1
#### OSPF Neighbors
<img src="task2-frr1-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task2-frr1-ospf-routes.jpg">

#### IP Routes
<img src="task2-frr1-ospf-iproutes.jpg">

### FRR2
#### OSPF Neighbors
<img src="task2-frr2-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task2-frr2-ospf-routes.jpg">

#### IP Routes
<img src="task2-frr2-ospf-iproutes.jpg">

### FRR3
#### OSPF Neighbors
<img src="task2-frr3-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task2-frr3-ospf-routes.jpg">

#### IP Routes
<img src="task2-frr3-ospf-iproutes.jpg">

### FRR4
#### OSPF Neighbors
<img src="task2-frr4-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task2-frr4-ospf-routes.jpg">

#### IP Routes
<img src="task2-frr4-ospf-iproutes.jpg">

### FRR5
#### OSPF Neighbors
<img src="task2-frr5-ospf-neighbors.jpg">

#### OSPF Routes
<img src="task2-frr5-ospf-routes.jpg">

#### IP Routes
<img src="task2-frr5-ospf-iproutes.jpg">

### R1 ping R2
<img src="task2-r1-ping-r2.jpg">

### R4 ping R2
<img src="task2-r4-ping-r2.jpg">

## TASK 3
Create the following topology and run ospf<br/>
First, send UDP iperf traffic from R1 to R2<br/>
Then, capture UDP packet to R2 using *tcpdump*<br/>
<br/>
<img src="topology3.jpg">
<br/>
### TASK 3 - Part 1
And then, create the following topology and run ospf. While sending UDP packets, break the line R1-R2.<br/>
<br/>
<img src="topology3-1.jpg">
<br/>
### TASK3 - PART 2
Create the following topology and run ospf
<br/>
<img src="topology3-2.jpg">
<br/>
#### Use Tcpdump to show UDP packets take a different path
We did this by analyzing the tcpdump capture and find the reaction time using Wireshark
<br/>
<img src="task3-2-wireshark-1.jpg">
<br/>
<br/>
<img src="task3-2-wireshark-2.jpg">
<br/>
### TASK3 - PART 3
Create the follsowing topology and run ospf. Then break another link R3-R2 and repeat the same analysis
<br/>
<img src="topology3-3.jpg">
<br/>
#### Use Tcpdump to show UDP packets take a different path
We did this by analyzing the tcpdump capture and find the reaction time using Wireshark
<br/>
<img src="task3-3-wireshark-1.jpg">
<br/>
<br/>
<img src="/img/task3-3-wireshark-2.jpg">
<br/>










