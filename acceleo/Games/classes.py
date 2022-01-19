class Game:
    def __init__(self, player, spawn, rooms, triggers):
        self.Player = player
        self.SpawnRoom = spawn
        self.RoomList = rooms
        self.TriggerList = triggers

""" CHARACTERS """

class Character:
    def __init__(self, inventory, stats, dead, actions):
        self.Inventory = inventory
        self.Stats = stats
        self.Dead = dead
        self.Actions = actions

class Player(Character):
    def __init__(self, currentRoom):
        self.CurrentRoom = currentRoom

class Npc(Character):
    def __init__(self, name, firstEncounter):
        self.Name = name
        self.FirstEncounterTrigger = firstEncounter

class CharacterAction:
    def __init__(self, name, description, consequence):
        self.Name=name
        self.Description=description
        self.Consequence=consequence

class Stat:
    def __init__(self, name, value):
        self.Name=name
        self.Value=value

""" ITEMS """

class Item:
    def __init__(self, name, _id, actions):
        self.Name = name
        self.Id = _id
        self.Actions = actions

class ItemAction:
    def __init__(self, name, description, consequence):
        self.Name=name
        self.Description=description
        self.Consequence=consequence


""" ROOMS """

class Room:
    def __init__(self, _id, items, npcs, north, south, east, west):
        self.North=north
        self.South=south
        self.East=east
        self.West=west
        self.Items=items
        self.Npcs=npcs
        self.Id=_id

class Door:
    def __init__(self, Open, Next, Id):
        self.Open=Open
        self.Next=Next
        self.Id=Id

""" CONSEQUENCES """

class Consequence:
    def __init__(self, message, consequence, ItemAction, CharacterAction):
        self.Message=message
        self.Consequence=consequence
        self.ItemAction=ItemAction
        self.CharacterAction=CharacterAction

class StatConsequence(Consequence):
    def __init__(self, stat, Character, value):
        self.Value=value
        self.Stat=stat
        self.Character=Character    

class ConsequenceGiveItem(Consequence):
    def __init__(self, items, Character):
        self.NewItems=items
        self.Character=Character


class ConsequenceSpawnItem(Consequence):
    def __init__(self, items, Room):
        self.NewItems=items
        self.Room=Room

class RoomConsequence(Consequence):
    def __init__(self, Door):
        self.Door=Door

class AnswerConsequence(Consequence):
    def __init__(self, Question, Answer):
        self.Question=Question
        self.Answer=Answer

""" TRIGGERS """

class Trigger:
    def __init__(self, Triggered, Id, EndGame, Consequences):
        self.Triggered=Triggered
        self.Id=Id
        self.EndGame=EndGame
        self.Consequences=Consequences

class RoomTrigger(Trigger):
    def __init__(self, Room):
        self.Room=Room

class ItemTrigger(Trigger):
    def __init__(self, Item):
        self.Item=Item

class NpcTrigger(Trigger):
    def __init__(self, Npc):
        self.Npc=Npc

class PlayerTrigger(Trigger):
    def __init__(self, Player):
        self.Player=Player
