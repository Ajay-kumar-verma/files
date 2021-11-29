const app= require('express')();

app.get('/',(req,res)=>{
    console.log(req.localport," Requested...!");
    res.send("HOME PAGE");
 
})

app.get('/:userId/:pswd', function (req, res) {
    res.send(req.params)
  })




app.listen(2000,()=>{
    console.log("Server is running at port 2000");
})