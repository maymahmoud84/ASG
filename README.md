# ASG
This repo contains the jar file for the ASG approach (API Usage Template via Structural Generalization)

# Running the Templates Miner ASG
To run the miner, use the following command 
```java -jar ASG.jar examples_dir ./Input out_dir ./Output ``` 

# Data Input and Output
* The repo contains sample examples for the twitter4j.Twitter API under the folder Input. You can use your usage examples by setting the examples_dir arguments to the examples folder.

* The templates can be found under OUT_DIR/API_NAME/Template_NUM/output/AUASTS/FinalAUAST.java

# Arguments
There are severals arguments that can be passed to the approach 
* example_dir: the path to the usage examples folder
* out_dir: the path to the ouptut directory
* k: value for the k-means clustering, default set at 15
* kitr: value for the maximum number of iteration for kmeans, default set at 1000
* nodes_sim: the thershold value for the similarity measure between two AST nodes to be considered a match
* ast_sim: the threshold value for the similarity measure between two ASTs to be considered a match
