# Ridership-Anomaly-Detection-showcase
To prepare for a future automobile network that serves the busiest NYC traffic hotspots, we need to understand at least two things about the traffic outflow: <br/>

<br/>
- External influential factors<br/>
- Internal dominated patterns<br/>
<br/>
In order to understand these two aspects, my research work covers the following three parts:<br/>
<br/>
(1) <b>Data Mining</b> : This is for obtaining incoming passenger count, which is one of the most intuitive external parameters. The major obstacle is that public datasets don't have the exact passenegr count. My work includes building Python Web Scraper to get the estimated passenger count by downloading the carrier capacity using carrier model name we have. Using the script I collected 38,821,550 records for JFK and LGA airport.<br/>
<br/>
(2) <b>Ridership Prediction</b> : We tested multiple models to fit the outgoing traffic data. Results show that traffic flow has strong temporal correlation. Random forest performs the best, while regression model combined with time series analysis can reach similar accuracy. <br/>
<br/>
(3) <b>Anomaly detection</b> : We perform residual analysis, and the results show that events like holidays are mostly detected using our pipeline, which states that our methodology is reasonable. <br/>     
<br/>
Our team is currently drafting publication on this topic, but jupyter notebook showcases for display can be found below. Those are class materials I made for the Applied Data Science (CUSP-GX-5004) at NYU in Fall 2019, for which I was the teaching assistant. <br/>
<br/>
* <a href="https://github.com/hhongjiang/Ridership-Anomaly-Detection-Display/blob/master/ModelSelection_JFK_AppliedDataScience__midterm.ipynb">Model Selection for JFK</a><br/>
* <a href="https://github.com/hhongjiang/Ridership-Anomaly-Detection-Display/blob/master/TimeSeriesExploration_JFK_AppliedDataScience__slide.ipynb">Time Series Exploration for JFK</a><br/>
<br/>
My work is part of the <a href="https://ucomp.net/project/mets-r-multi-modal-energy-optimal-trip-scheduling-in-real-time-for-transportation-hubs/">METS-R: Multi-modal Energy-optimal Trip Scheduling in Real-time for Transportation Hubs</a> project, supervised by Dr. Stanislav Sobolevsky in the <a href="https://ucomp.net/">Urban Complexity Lab</a> in NYU Center for Urban Science. It is collaborated with Purdue University and sponsored by US Department of Energy.
<br/>
