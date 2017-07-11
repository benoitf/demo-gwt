define(["require", "exports"], function (require, exports) {
    "use strict";
    exports.__esModule = true;
    function load() {


        var content=`
        <style>

.links line {
  stroke: #999;
  stroke-opacity: 0.6;
}

.nodes circle {
  stroke: #fff;
  stroke-width: 1.5px;
}

</style>
<svg id="svg-d3" width="960" height="300"></svg>
`

var scriptContent = `

require( ['http://localhost:9000/d3.js'],
    function (d3) {
        console.log("d3 loaded");

var svg = d3.select("#svg-d3"),
    width = +svg.attr("width"),
    height = +svg.attr("height");

var color = d3.scaleOrdinal(d3.schemeCategory20);

var simulation = d3.forceSimulation()
    .force("link", d3.forceLink().id(function(d) { return d.id; }))
    .force("charge", d3.forceManyBody())
    .force("center", d3.forceCenter(width / 2, height / 2));

d3.json("https://gist.githubusercontent.com/benoitf/5e73389b80cea33853a93eb99c0823b2/raw/3f20bfacfef890a14b939fb303e9fccccb0731c1/gistfile1.txt", function(error, graph) {
  if (error) throw error;

  var link = svg.append("g")
      .attr("class", "links")
    .selectAll("line")
    .data(graph.links)
    .enter().append("line")
      .attr("stroke-width", function(d) { return Math.sqrt(d.value); });

  var node = svg.append("g")
      .attr("class", "nodes")
    .selectAll("circle")
    .data(graph.nodes)
    .enter().append("circle")
      .attr("r", 5)
      .attr("fill", function(d) { return color(d.group); })
      .call(d3.drag()
          .on("start", dragstarted)
          .on("drag", dragged)
          .on("end", dragended));

  node.append("title")
      .text(function(d) { return d.id; });

  simulation
      .nodes(graph.nodes)
      .on("tick", ticked);

  simulation.force("link")
      .links(graph.links);

  function ticked() {
    link
        .attr("x1", function(d) { return d.source.x; })
        .attr("y1", function(d) { return d.source.y; })
        .attr("x2", function(d) { return d.target.x; })
        .attr("y2", function(d) { return d.target.y; });

    node
        .attr("cx", function(d) { return d.x; })
        .attr("cy", function(d) { return d.y; });
  }
});

function dragstarted(d) {
  if (!d3.event.active) simulation.alphaTarget(0.3).restart();
  d.fx = d.x;
  d.fy = d.y;
}

function dragged(d) {
  d.fx = d3.event.x;
  d.fy = d3.event.y;
}

function dragended(d) {
  if (!d3.event.active) simulation.alphaTarget(0);
  d.fx = null;
  d.fy = null;
}

    }
);

        `;

        //
        var panels = new che.Panels();
        panels.addInformationPanel("My First Panel", content, scriptContent);

        panels.addNavigationPanel("My Navigate Panel", "<h1>Hello</h1> This is my content");



        // Register an action
        var cheActions = new che.Actions();
        var cheAction = new che.actions.SimpleAction("HelloAction", "This is my Action", function(actionEvent) {
            console.log("We clicked on the action hello and the event is", actionEvent);
        });

        cheActions.actionManager.registerAction("helloActionID", cheAction);
        console.log("action registered");

        // Add action in menu
        cheActions.addActionMenu("helpGroup", cheAction);
        //
        // // get document
        // var cheWindow = che.Window();
        // var editor = cheWindow.editor;
        // var myDoc = editor.readonlyDocument;
        //
        // console.log("Plugin1: Document lineCount is ", myDoc.getLineCount());
        // console.log("Plugin1: Document content is ", myDoc.getContents());
        // console.log("Plugin1: Document cursor offset is ", myDoc.getCursorOffset());getCursorOffset






    }
    exports.load = load;
    function unload() {
        console.log("unloading code of plugin 1");
    }
    exports.unload = unload;
});

//# sourceMappingURL=lifecycle-plugin1.js.map