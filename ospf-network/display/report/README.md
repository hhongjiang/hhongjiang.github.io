# OSPF with FRRouting and Docker Lab Report
In this report, I documented my process of building OSPF network among Docker containers and performed network experiments and package analysis.
## Software Requirement
The following software suites are used under Ubuntu 16.04 system:
* FRRouting
  * <a href="http://docs.frrouting.org/en/latest/installation.html#from-packages">Installation from source</a>
  * <a href="https://hub.docker.com/r/cumulusnetworks/frrouting">Image from cumulusnetworks</a>
* Docker containers
  * <a href="https://docs.docker.com/install/linux/docker-ce/ubuntu/">Installation</a>


## TASK 1
Create the following topology and run ospf<br/>
<br/>
![topology1](img/topology1.jpg)
<br/>
And for each container, show:<br/>
* ospf neighbors
* ospf routes
* ip routes

<br/>And then, show you can successfully:
* R1 ping R2
* R4 ping R2

### FRR1
#### OSPF Neighbors
![task1-frr1-ospf-neighbors](img/task1-frr1-ospf-neighbors.jpg)

#### OSPF Routes
![task1-frr1-ospf-routes](img/task1-frr1-ospf-routes.jpg)

#### IP Routes
![task1-frr1-ospf-iproutes](img/task1-frr1-ospf-iproutes.jpg)

### FRR2
#### OSPF Neighbors
![task1-frr2-ospf-neighbors](img/task1-frr2-ospf-neighbors.jpg)

#### OSPF Routes
![task1-frr2-ospf-routes](img/task1-frr2-ospf-routes.jpg)

#### IP Routes
![task1-frr2-ospf-iproutes](img/task1-frr2-ospf-iproutes.jpg)

### FRR3
#### OSPF Neighbors
![task1-frr3-ospf-neighbors](img/task1-frr3-ospf-neighbors.jpg)

#### OSPF Routes
![task1-frr3-ospf-routes](img/task1-frr3-ospf-routes.jpg)

#### IP Routes
![task1-frr3-ospf-iproutes](img/task1-frr3-ospf-iproutes.jpg)

### FRR4
#### OSPF Neighbors
![task1-frr4-ospf-neighbors](img/task1-frr4-ospf-neighbors.jpg)

#### OSPF Routes
![task1-frr4-ospf-routes](img/task1-frr4-ospf-routes.jpg)

#### IP Routes
![task1-frr4-ospf-iproutes](img/task1-frr4-ospf-iproutes.jpg)

### FRR5
#### OSPF Neighbors
![task1-frr5-ospf-neighbors](img/task1-frr5-ospf-neighbors.jpg)

#### OSPF Routes
![task1-frr5-ospf-routes](img/task1-frr5-ospf-routes.jpg)

#### IP Routes
![task1-frr5-ospf-iproutes](img/task1-frr5-ospf-iproutes.jpg)

### R1 ping R2
![task1-r1-ping-r2](img/task1-r1-ping-r2.jpg)

### R4 ping R2
![task1-r4-ping-r2](img/task1-r4-ping-r2.jpg)

## TASK2
Create the following topology and run ospf with link cost
<br/>
![topology2](img/topology2.jpg)
<br/>
And for each container, show:<br/>
* ospf neighbors
* ospf routes
* ip routes

<br/>And then, show you can successfully:
* R1 ping R2
* R4 ping R2

### FRR1
#### OSPF Neighbors
![task2-frr1-ospf-neighbors](img/task2-frr1-ospf-neighbors.jpg)

#### OSPF Routes
![task2-frr1-ospf-routes](img/task2-frr1-ospf-routes.jpg)

#### IP Routes
![task2-frr1-ospf-iproutes](img/task2-frr1-ospf-iproutes.jpg)

### FRR2
#### OSPF Neighbors
![task2-frr2-ospf-neighbors](img/task2-frr2-ospf-neighbors.jpg)

#### OSPF Routes
![task2-frr2-ospf-routes](img/task2-frr2-ospf-routes.jpg)

#### IP Routes
![task2-frr2-ospf-iproutes](img/task2-frr2-ospf-iproutes.jpg)

### FRR3
#### OSPF Neighbors
![task2-frr3-ospf-neighbors](img/task2-frr3-ospf-neighbors.jpg)

#### OSPF Routes
![task2-frr3-ospf-routes](img/task2-frr3-ospf-routes.jpg)

#### IP Routes
![task2-frr3-ospf-iproutes](img/task2-frr3-ospf-iproutes.jpg)

### FRR4
#### OSPF Neighbors
![task2-frr4-ospf-neighbors](img/task2-frr4-ospf-neighbors.jpg)

#### OSPF Routes
![task2-frr4-ospf-routes](img/task2-frr4-ospf-routes.jpg)

#### IP Routes
![task2-frr4-ospf-iproutes](img/task2-frr4-ospf-iproutes.jpg)

### FRR5
#### OSPF Neighbors
![task2-frr5-ospf-neighbors](img/task2-frr5-ospf-neighbors.jpg)

#### OSPF Routes
![task2-frr5-ospf-routes](img/task2-frr5-ospf-routes.jpg)

#### IP Routes
![task2-frr5-ospf-iproutes](img/task2-frr5-ospf-iproutes.jpg)

### R1 ping R2
![task2-r1-ping-r2](img/task2-r1-ping-r2.jpg)

### R4 ping R2
![task2-r4-ping-r2](img/task2-r4-ping-r2.jpg)

## TASK 3
Create the following topology and run ospf<br/>
First, send UDP iperf traffic from R1 to R2<br/>
Then, capture UDP packet to R2 using *tcpdump*<br/>
<br/>
![topology3](img/topology3.jpg)
<br/>
### TASK 3 - Part 1
And then, create the following topology and run ospf. While sending UDP packets, break the line R1-R2.<br/>
<br/>
![topology3-1](img/topology3-1.jpg)
<br/>
### TASK3 - PART 2
Create the following topology and run ospf
<br/>
![topology3-2](img/topology3-2.jpg)
<br/>
#### Use Tcpdump to show UDP packets take a different path
We did this by analyzing the tcpdump capture and find the reaction time using Wireshark
<br/>
![task3-2-wireshark-1](img/task3-2-wireshark-1.jpg)
<br/>
<br/>
![task3-2-wireshark-2](img/task3-2-wireshark-2.jpg)
<br/>
### TASK3 - PART 3
Create the follsowing topology and run ospf. Then break another link R3-R2 and repeat the same analysis
<br/>
![topology3-3](img/topology3-3.jpg)
<br/>
#### Use Tcpdump to show UDP packets take a different path
We did this by analyzing the tcpdump capture and find the reaction time using Wireshark
<br/>
![task3-3-wireshark-1](img/task3-3-wireshark-1.jpg)
<br/>
<br/>
![task3-3-wireshark-2](img/task3-3-wireshark-2.jpg)











