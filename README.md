# chord-progression-generator
Randomly generates 100 progressions in the key of C, and then ranks them. a prgression is stored as a list of 4 numbers from 1-7.
The algorithm outputs chords in the key of C (1=C, 2=Dm, 3=Em, 4=F, 5=G, 6=Am, 7=Bo).
Progressions containing 1 and 5 are favoured heavily, and progressions that contain 2 or less distinct chords are penalized.

Ways to improve:

Add more rules (especially rules that apply to the order of the chords.
                Things like 4-1 and 5-1 should be favoured, for example)
                
Once more rules are added, randomly apply rules to make algorithm less predictable
(make its "musical taste" different each time)


rule ideas to implement (favor progressions that):
end in 1
end in 5
contain tension-resolution (7-1, 2-1,6-5)
end in 2-5-1/4-5-1
