console.log("Begining loading of the my-plugin javascript...");


var myType = new che.MyPlugin();
console.log("public method", myType.aPublicMethod());
console.log("static method", che.MyPlugin.aStaticMethd());

console.log("trace inside plugin");

console.log("che.CheAPI = ", che.CheAPI);
var bus = che.CheAPI.getBus();
console.log("bus = ", bus);
console.log("bus endpoint = ", bus.getEndPoint());


var cheAPI = new che.CheAPI();
console.log("cheAPI = ", cheAPI);
console.log("bus endpoint = ", cheAPI.bus.getEndPoint());


var notificationManager = cheAPI.notificationManager;
console.log("notificationManager = ", notificationManager);

console.log("notify... = ");
var notification = notificationManager.notify("notifying....");

console.log("notification... = ", notification);

console.log("notification title  = ", notification.getTitle());
console.log("notification content = ", notification.getContent());

