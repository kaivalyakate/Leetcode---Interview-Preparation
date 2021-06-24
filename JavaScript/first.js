let ladder = {
  step: 0,
  up() {
    this.step++;
    return this;
  },
  down() {
    this.step--;
    return this;
  },
  showStep: function() { // shows the current step
    console.log(this.step);
    return this;
  }
};

function User(name, admin){
    this.name = name;
    this.admin = admin;
    this.IsAdmin = function(){
        console.log(true);
    }
};

function Accumulator(StartingValue){
    this.value = StartingValue;
    this.add = function(){
        let value = Number(prompt("Enter a Value"));
        this.value+=value;
    };
}

let user = new User("KK", "BK");
console.log(user);
user.IsAdmin();
console.log(ladder.up().up().up().down().showStep().up().showStep());

let acc = new Accumulator(Number(0));
acc.add();
console.log(acc.value);