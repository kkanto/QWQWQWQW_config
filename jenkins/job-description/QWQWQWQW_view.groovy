 
listView('QWQWQWQW Jobs') {
    description('QWQWQWQW Jobs')
    jobs {
        regex('QWQWQWQW_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
