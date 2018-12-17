Chart.scaleService.updateScaleDefaults('linear', {
    ticks: {
      callback: function(tick) {
        return  tick.toLocaleString();
      },
    beginAtZero: true,
    }
  });
  
  // Global method for setting tooltip number format.
  Chart.defaults.global.tooltips.callbacks.label = function(tooltipItem, data) {
    var dataset = data.datasets[tooltipItem.datasetIndex];
    var datasetLabel = dataset.label || '';
    return datasetLabel + ": " + dataset.data[tooltipItem.index].toLocaleString();
  };
  

  var puntuacion = [0, 1, 2, 3, 4, 5];
let respuestastest = []

let respuestastestStr = window.localStorage.getItem('respuestasTest');
var resultadosTest = JSON.parse(respuestastestStr);
let resultadoPrim = resultadosTest[0]
let resultadoSecyCuatri = parseInt(resultadosTest[1]) + parseInt(resultadosTest[3]);
let resultadoTri = resultadosTest[2]
let resultadoQuinque = resultadosTest[4]


  var ctx = document.getElementById("myChart");
  var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
      labels: ["Depression", "Stress", "Social Anxiety", "Anxiety"],
      datasets: [{
        label: "Test results",
        data: [resultadoPrim, resultadoSecyCuatri, resultadoTri, resultadoQuinque],
        backgroundColor: [
          'rgba(255, 99, 132, 0.4)',
          'rgba(54, 162, 235, 0.4)',
          'rgba(255, 206, 86, 0.4)',
          'rgba(75, 192, 192, 0.4)',
          'rgba(153, 102, 255, 0.4)',
          'rgba(255, 159, 64, 0.4)'
        ],
        borderColor: [
          'rgba(255,99,132,1)',
          'rgba(54, 162, 235, 1)',
          'rgba(255, 206, 86, 1)',
          'rgba(75, 192, 192, 1)',
          'rgba(153, 102, 255, 1)',
          'rgba(255, 159, 64, 1)'
        ],
        borderWidth: 2
      }]
    }
  });
  



// localStorage.setItem("respuestasTest");

// for (let index = 0; index < localStorage.length; index++) {
//     const key = localStorage.key[index];

//     if key.indexOf("respuestasTest") === 0 {
//         let elem = localStorage.getItem(key);
//         console.log(elem)



    
    
