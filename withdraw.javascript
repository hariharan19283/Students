function getBalance() {
    return $this->balance;
}

function withdraw($amount) {
    $this->balance = $this->getBalance() - $amount;
}

function deposit($amount) {
    if($amout <= 0){
        return;
    }

    $this->balance = $this->getBalance() + $amount;
}