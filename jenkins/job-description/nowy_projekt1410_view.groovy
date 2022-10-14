 
listView('nowy_projekt1410 Jobs') {
    description('nowy_projekt1410 Jobs')
    jobs {
        regex('nowy_projekt1410_.+')
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
