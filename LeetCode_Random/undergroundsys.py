class UndergroundSystem:

    def __init__(self):
        self.histories = {}
        self.passengers = {}

    def checkIn(self, id: int, stationName: str, t: int) -> None:
        self.passengers[id] = [stationName, t]
        if(stationName not in self.histories.keys()):
            self.histories[stationName] = {}

    def checkOut(self, id: int, stationName: str, t: int) -> None:
        passg = self.passengers[id]
        if (stationName not in self.histories[passg[0]]):
            self.histories[passg[0]][stationName] = [t-passg[1]]
        else:
            self.histories[passg[0]][stationName].append(t-passg[1])
        del self.passengers[id]

    def getAverageTime(self, startStation: str, endStation: str) -> float:
        if (startStation not in self.histories):
            return 0.0000
        elif (startStation in self.histories):
            if (endStation not in self.histories[startStation]) or (self.histories[startStation][endStation] == []):
                return 0.0000
        return round(sum(self.histories[startStation][endStation])/len(self.histories[startStation][endStation]), 4)


obj = UndergroundSystem()
query = ["UndergroundSystem", "checkIn", "checkOut", "getAverageTime", "checkIn",
         "checkOut", "getAverageTime", "checkIn", "checkOut", "getAverageTime"]

consts = [[], [10, "Leyton", 3], [10, "Paradise", 8], ["Leyton", "Paradise"], [5, "Leyton", 10], [
    5, "Paradise", 16], ["Leyton", "Paradise"], [2, "Leyton", 21], [2, "Paradise", 30], ["Leyton", "Paradise"]]

for i in range(1, len(query)):
    if query[i] == "checkIn":
        obj.checkIn(consts[i][0], consts[i][1], consts[i][2])
    elif query[i] == "checkOut":
        obj.checkOut(consts[i][0], consts[i][1], consts[i][2])
    elif query[i] == "getAverageTime":
        print(obj.getAverageTime(consts[i][0], consts[i][1]))
